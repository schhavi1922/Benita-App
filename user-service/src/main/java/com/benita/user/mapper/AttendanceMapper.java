package com.benita.user.mapper;

import com.benita.user.entity.Attendance;
import com.benita.user.entity.User;
import com.benita.user.repository.UserRepository;
import com.benita.user.wrapper.request.AttendanceForm;
import com.benita.user.wrapper.response.AttendanceDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AttendanceMapper {

    private final UserMapper userMapper;

    public Attendance toEntity(AttendanceForm attendanceForm, User user) {
        Attendance attendance = new Attendance();
        attendance.setUser(user);
        attendance.setDate(attendanceForm.getDate());
        attendance.setCheckIn(attendanceForm.getCheckIn());
        attendance.setCheckOut(attendanceForm.getCheckOut());
        attendance.setLatitude(attendanceForm.getLatitude());
        attendance.setLongitude(attendanceForm.getLongitude());
        attendance.setRemarks(attendanceForm.getRemarks());
        return attendance;
    }

    public Object toDto(Attendance attendance) {
        AttendanceDto attendanceDto = new AttendanceDto();
        attendanceDto.setUserDto(userMapper.toDto(attendance.getUser()));
        attendanceDto.setDate(attendance.getDate());
        attendanceDto.setCheckIn(attendance.getCheckIn());
        attendanceDto.setCheckOut(attendance.getCheckOut());
        attendanceDto.setLatitude(attendance.getLatitude());
        attendanceDto.setLongitude(attendance.getLongitude());
        attendanceDto.setRemarks(attendance.getRemarks());
        return attendance;
    }
}
