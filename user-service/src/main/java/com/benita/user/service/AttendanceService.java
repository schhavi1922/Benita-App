package com.benita.user.service;

import com.benita.user.base.BaseResponse;
import com.benita.user.entity.Attendance;
import com.benita.user.entity.User;
import com.benita.user.mapper.AttendanceMapper;
import com.benita.user.repository.AttendanceRepository;
import com.benita.user.repository.UserRepository;
import com.benita.user.wrapper.request.AttendanceForm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;
    private final AttendanceMapper attendanceMapper;
    private final UserRepository userRepository;

    public BaseResponse checkIn(AttendanceForm attendanceForm) {
        BaseResponse response = new BaseResponse();
        try {
            Optional<User> optionalUser = userRepository.findById(attendanceForm.getUserId());
            if (optionalUser.isPresent()) {
                return response.set(302, "User not found");
            }
            Attendance attendance = attendanceRepository.save(attendanceMapper.toEntity(attendanceForm,
                    optionalUser.get()));
        }catch (Exception e) {
            log.error("Exception while checkIn() : ", e);
            response.setSomethingWentWrong();
        }
        return response;
    }
}
