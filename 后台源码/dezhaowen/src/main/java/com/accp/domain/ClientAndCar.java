package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class ClientAndCar {
    private String name;
    private String address;
    private String carer;
    private String carerphone;
    private String carBrandName;
    private String carTypeName;
    private String engineBrandName;
    private String enginenumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jqinsurancedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date maintaindate;
    private Integer integral;
    private Float onCredit;
    private Float deposit;
    private String clientType;
    private Float cost;
    private String carnumber;




}