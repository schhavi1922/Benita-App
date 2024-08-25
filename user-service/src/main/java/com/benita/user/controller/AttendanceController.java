package com.benita.user.controller;

import com.benita.user.base.BaseController;
import com.benita.user.base.BaseResponse;
import com.benita.user.entity.User;
import com.benita.user.service.AttendanceService;
import com.benita.user.wrapper.request.AttendanceForm;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("attendance")
public class AttendanceController extends BaseController {

    private final AttendanceService attendanceService;

    @PostMapping("/checkIn")
    public BaseResponse checkIn(@RequestBody AttendanceForm attendanceForm) {
        log.info("Executing checkIn() with : {}", attendanceForm);
        return attendanceService.checkIn(attendanceForm);
    }

    @PostMapping("/checkOut")
    public BaseResponse checkOut(@RequestBody AttendanceForm attendanceForm) {
        log.info("Executing checkOut() with : {}", attendanceForm);
        return attendanceService.checkOut(attendanceForm);
    }

    @GetMapping("/getAttendanceHistory")
    public BaseResponse getAttendanceHistory(HttpServletRequest request) {
        log.info("Executing getAttendanceHistory()");
        User user = super.getUserNameByHeader(request);
        if (user == null) {
            return new BaseResponse().setUnauthorized();
        }
        return attendanceService.getAttendanceHistory(user);
    }
}
