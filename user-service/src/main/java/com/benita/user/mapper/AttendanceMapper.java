package com.benita.user.mapper;

import com.benita.user.entity.Attendance;
import com.benita.user.entity.User;
import com.benita.user.repository.UserRepository;
import com.benita.user.wrapper.request.AttendanceForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AttendanceMapper {

    private final UserRepository userRepository;

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
}
