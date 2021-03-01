package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author yy
 * @since 2021-02-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Car对象", description="")
public class Car extends Model<Car> {

    private static final long serialVersionUID=1L;
    @TableId(value = "carnum",type = IdType.AUTO)

    private String brandname;
    private String customername;
    private String fname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date jjdate;


    @ApiModelProperty(value = "车辆号码")
    private Integer carnum;

    @TableField(exist = false)
    private Caraffiliation caraffiliation;

    @TableField(exist = false)
    private  Carbrand carbrand;

    @TableField(exist = false)
    private Chexingdingyibiao chexingdingyibiao;

    @TableField(exist = false)
    private Mlicompany mlicompany;

    @TableField(exist = false)
    private Cicompany cicompany;

    @TableField(exist = false)
    private  Oiltype oiltype;

    @TableField(exist = false)
    private Fadongjipinpaibiao fadongjipinpaibiao;
    @ApiModelProperty(value = "车牌号")
    private String platename;

    @ApiModelProperty(value = "车辆品牌id外键 朱灿品牌表的主键")
    private Integer carbrandid;

    @ApiModelProperty(value = "驾驶员")
    private String driver;

    @ApiModelProperty(value = "驾驶员电话")
    private String driverphone;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "车辆归属id外键 车辆归属表中的主键")
    private Integer caraffiliationid;

    @ApiModelProperty(value = "驾驶员地址")
    private String driveraddress;

    @ApiModelProperty(value = "驾证到期")
    private String drivingouttime;

    @ApiModelProperty(value = "车驾号")
    private String framnum;

    @ApiModelProperty(value = "发动机号")
    private String enginenum;

    @ApiModelProperty(value = "发动机id外键 朱灿的发动机表的id")
    private Integer engineid;

    @ApiModelProperty(value = "车辆年款")
    private String carnyear;

    @ApiModelProperty(value = "里程")
    private String mileage;


    @ApiModelProperty(value = "载重")
    @TableField("`load`")
    private String load;

    @ApiModelProperty(value = "车系")
    private String carseries;

    @ApiModelProperty(value = "购买日期")
    private String buytime;

    @ApiModelProperty(value = "上牌日期")
    private String uptime;

    @ApiModelProperty(value = "车险到期")
    private String carouttime;

    @ApiModelProperty(value = "交强险保险公司id")
    private Integer mlicompanyid;

    @ApiModelProperty(value = "交强险到期")
    private String mliouttime;

    @ApiModelProperty(value = "商业险保险公司id")
    private Integer cicompanyid;

    @ApiModelProperty(value = "商业险到期")
    private String ciouttime;

    @ApiModelProperty(value = "在我投保车")
    private String mytoucar;

    @ApiModelProperty(value = "二维日期")
    private String twotime;

    @ApiModelProperty(value = "燃油类别id")
    private Integer oiltypeid;

    @ApiModelProperty(value = "下次保养里程")
    private String nextmileage;

    @ApiModelProperty(value = "下次保养日期")
    private String nextupkeeptime;

    @ApiModelProperty(value = "会员码")
    private String membernum;

    @ApiModelProperty(value = "客户编码")
    private String customernum;

    @ApiModelProperty(value = "备用字段")
    private String car1;

    @ApiModelProperty(value = "备用字段")
    private String car2;

    @ApiModelProperty(value = "备用字段")
    private String car3;


    public static final String CARNUM = "carnum";

    public static final String PLATENAME = "platename";

    public static final String CARBRANDID = "carbrandid";

    public static final String DRIVER = "driver";

    public static final String DRIVERPHONE = "driverphone";

    public static final String BIRTHDAY = "birthday";

    public static final String CARAFFILIATIONID = "caraffiliationid";

    public static final String DRIVERADDRESS = "driveraddress";

    public static final String DRIVINGOUTTIME = "drivingouttime";

    public static final String FRAMNUM = "framnum";

    public static final String ENGINENUM = "enginenum";

    public static final String ENGINEID = "engineid";

    public static final String CARNYEAR = "carnyear";

    public static final String MILEAGE = "mileage";

    public static final String LOAD = "load";

    public static final String CARSERIES = "carseries";

    public static final String BUYTIME = "buytime";

    public static final String UPTIME = "uptime";

    public static final String CAROUTTIME = "carouttime";

    public static final String MLICOMPANYID = "mlicompanyid";

    public static final String MLIOUTTIME = "mliouttime";

    public static final String CICOMPANYID = "cicompanyid";

    public static final String CIOUTTIME = "ciouttime";

    public static final String MYTOUCAR = "mytoucar";

    public static final String TWOTIME = "twotime";

    public static final String OILTYPEID = "oiltypeid";

    public static final String NEXTMILEAGE = "nextmileage";

    public static final String NEXTUPKEEPTIME = "nextupkeeptime";

    public static final String MEMBERNUM = "membernum";

    public static final String CUSTOMERNUM = "customernum";

    public static final String CAR1 = "car1";

    public static final String CAR2 = "car2";

    public static final String CAR3 = "car3";

    @Override
    protected Serializable pkVal() {
        return this.carnum;
    }

}
