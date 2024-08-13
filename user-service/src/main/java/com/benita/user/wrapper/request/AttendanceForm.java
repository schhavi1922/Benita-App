package com.benita.user.wrapper.request;

import lombok.Data;

import java.util.Date;

@Data
public class AttendanceForm {

    private Integer userId;

    private Date date;

    private Date checkIn;

    private Date checkOut;

    private String latitude;

    private String longitude;

    private String remarks;
}
