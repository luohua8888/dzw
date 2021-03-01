package com.accp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class JunGong {
    private String status;
    private String type;
    private String clientname;
    private String carnumber;
    private String number;
    private String tname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date overworkdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowworkdate;
    private String worktime;
    private String cartypename;
    private String clientType;
    private String carnumber1;
    private String reason;
    private Integer count;
    private String fgreason;
    private String name;
    private Float price;


}