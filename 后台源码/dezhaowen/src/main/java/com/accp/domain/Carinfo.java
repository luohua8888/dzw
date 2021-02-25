package com.accp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Carinfo {

    private String carbrandname;

    private String cartypename;

    private String enginebrandname;

    private String loadnumber;


    private Boolean check;

    private String clientname;

    private Integer id;

    private String carnumber;

    private Integer carbrandid;

    private Integer carid;

    private String carer;

    private String carerphone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date borndate;

    private String affiliation;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date drivinglicence;

    private String carnumber1;

    private String enginenumber;

    private Float yearprice;

    private Float mileage;

    private Integer engineid;

    private String deadweight;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date buydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dutydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date carcheckdate;

    private String fueloiltype;

    private String carseries;

    private String jqinsurance;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jqinsurancedate;

    private String syinsurance;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date syinsurancedate;

    private Float maintain;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date maintaindate;

    private String clientid;


    private String insuredcar;

    private String otherone;


    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;


    private String carTypeName;
    private String carBrandName;

    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jjdate;
}
