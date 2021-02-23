package com.accp.domain;

import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Data
public class RepairAndRescue {
    private String clientname;
    private String carNumber;
    private String phone;
    private String tname;
    private String number;
    private String type;
    private String status;
    private Float price;
    private String getman;
    private String name;
    private Integer carinfoid;

    private String staffno;
    private String clienttype;


    private String oil;



    private String worktime;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date overworkdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowworkdate;

    private String setter;

    private String company;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date befor;



    private String remark;

    private String state;

    private String fault;

    private String faultreasult;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stockdater;



}