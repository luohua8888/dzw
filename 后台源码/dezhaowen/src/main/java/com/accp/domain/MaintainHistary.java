package com.accp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class MaintainHistary {
	    private String number;
	    private String itemTypeName;
	    private String name;
	    private String carNumber;
	    private String phone;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date nowworkDate;
	    private Float price;	
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date orderTime;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date stockDater;
	    private Integer id;
	    private String itemsName;
	    private String priceType;
	    private Integer workhour;
	    private Float fprice;
	    private String artisanClassName;
	    private String faultreasult;
	    private String type;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private Date lldate;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private Date overworkdate;
		private String llpeople;
	    private String llnumber;
	    private String llname;
	    private String dw;
	    private String gw;
		private Integer count;
	    private Float qprice;
	    private Float hprice;
	   

		private Float allprice;
		private String lltype;
	   

		private String itemname;
	    
	    

}