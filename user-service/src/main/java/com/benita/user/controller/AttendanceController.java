package com.benita.user.controller;

import com.benita.user.base.BaseResponse;
import com.benita.user.service.AttendanceService;
import com.benita.user.wrapper.request.AttendanceForm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    @PostMapping("/checkIn")
    public BaseResponse checkIn(@RequestBody AttendanceForm attendanceForm) {
        log.info("Executing checkIn() with : {}", attendanceForm);
        return attendanceService.checkIn(attendanceForm);
    }
}
