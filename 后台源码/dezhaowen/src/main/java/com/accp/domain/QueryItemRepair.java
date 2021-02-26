package com.accp.domain;

import lombok.Data;

@Data
public class QueryItemRepair {
	
	private Integer id;
	private Float qprice;
	private Float hprice;
	
	private String itemsname;
	private String bzname;
	private String fwman;
	private Integer bzid;
	private Integer count;
	
	private String priceType;
	
	private String normalPrice;
	
	private String price;
	
	private String discountsPrice;
	
	private String artisanClassName;
	
	private String name;
	
	private String acid;
	
	private String number;
	
	private String cause;
	
	private Integer teamid;
	
	private Integer itemid;
}