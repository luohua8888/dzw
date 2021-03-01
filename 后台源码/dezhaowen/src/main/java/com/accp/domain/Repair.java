package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Repair对象", description="")
public class Repair extends Model<Repair> {

    @TableField(exist = false)
    private String startkd;
    @TableField(exist = false)
    private String endkd;

    private static final long serialVersionUID=1L;
<<<<<<< HEAD

    private String carnumber;

    private Boolean check;

    private Float totalnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cashiertime;

    private String staffname;

    private String paymenttype;

    private String wtype;

    private String carbrandname;

    private String clientname;

    private String cartypename;

    private String carnumber1;

    private String carerphone;

    private String jqinsurance;

    private String staffpeople;

=======
    @TableId
>>>>>>> b9a6f13471ccbbab8dc125f68a565757fa56245f
    @ApiModelProperty(value = "维修编号")
    private String number;

    @ApiModelProperty(value = "与车辆信息表关联")
    @TableField("carinfoId")
    private Integer carinfoId;

    @ApiModelProperty(value = "与员工关联")
    private String staffno;

    @ApiModelProperty(value = "进厂油量")
    private String oil;

    @ApiModelProperty(value = "业务类别")
    private String type;

    @ApiModelProperty(value = "施工班次")
    private String worktime;

    @ApiModelProperty(value = "接车人")
    private String getman;
<<<<<<< HEAD

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "预计完工时间")
    private LocalDateTime overworkdate;

=======
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "预计完工时间")
    private Date overworkdate;
>>>>>>> b9a6f13471ccbbab8dc125f68a565757fa56245f
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "实际完工时间")
    @TableField("nowworkDate")
    private Date nowworkDate;

    @ApiModelProperty(value = "结算方式")
    private String setter;

    @ApiModelProperty(value = "赔款公司")
    private String company;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "上次进场时间")
    private Date befor;

    @ApiModelProperty(value = "预估金额")
    private Float price;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "报修陈述")
    private String state;

    @ApiModelProperty(value = "故障描述")
    private String fault;

    @ApiModelProperty(value = "故障原因")
    private String faultreasult;

    @ApiModelProperty(value = "维修状态")
    private String status;
<<<<<<< HEAD

    @DateTimeFormat(pattern = "yyyy-MM-dd ")
=======
    @DateTimeFormat(pattern = "yyyy-MM-dd")
>>>>>>> b9a6f13471ccbbab8dc125f68a565757fa56245f
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "开单时间")
    @TableField("orderTime")
    private Date orderTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结算时间")
    @TableField("stockDater")
    private Date stockDater;

    @ApiModelProperty(value = "其它字段1")
    private String otherone;

    @ApiModelProperty(value = "其它字段2")
    private String othertwo;

    @ApiModelProperty(value = "其它字段3")
    private String otherthree;

    @ApiModelProperty(value = "其它字段4")
    private String otherfour;

    @ApiModelProperty(value = "其它字段5")
    private String otherfive;


    public static final String NUMBER = "number";

    public static final String CARINFOID = "carinfoId";

    public static final String STAFFNO = "staffno";

    public static final String OIL = "oil";

    public static final String TYPE = "type";

    public static final String WORKTIME = "worktime";

    public static final String GETMAN = "getman";

    public static final String OVERWORKDATE = "overworkdate";

    public static final String NOWWORKDATE = "nowworkDate";

    public static final String SETTER = "setter";

    public static final String COMPANY = "company";

    public static final String BEFOR = "befor";

    public static final String PRICE = "price";

    public static final String REMARK = "remark";

    public static final String STATE = "state";

    public static final String FAULT = "fault";

    public static final String FAULTREASULT = "faultreasult";

    public static final String STATUS = "status";

    public static final String ORDERTIME = "orderTime";

    public static final String STOCKDATER = "stockDater";

    public static final String OTHERONE = "otherone";

    public static final String OTHERTWO = "othertwo";

    public static final String OTHERTHREE = "otherthree";

    public static final String OTHERFOUR = "otherfour";

    public static final String OTHERFIVE = "otherfive";

    @Override
    protected Serializable pkVal() {
        return this.number;
    }

}
