package com.accp.domain;

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
@ApiModel(value="Rescue对象", description="")
public class Rescue extends Model<Rescue> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "救援编号")
    private String number;

    @ApiModelProperty(value = "与车辆信息表关联")
    private Integer carinfoid;

    @ApiModelProperty(value = "与员工关联")
    private String staffno;

    @ApiModelProperty(value = "派工班组与班组表关联")
    @TableField("rescueTeamid")
    private Integer rescueTeamid;

    @ApiModelProperty(value = "业务类别")
    private String type;

    @ApiModelProperty(value = "施工班次")
    private String worktimes;

    @ApiModelProperty(value = "接车人")
    private String getman;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "派工时间")
    private Date workdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "出发时间")
    private Date nowdate;

    @ApiModelProperty(value = "出发地址")
    private String address;

    @ApiModelProperty(value = "驾驶车辆")
    private String car;

    @ApiModelProperty(value = "行驶里程")
    private Float liche;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "施工时间")
    private Date worktime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "结束时间")
    private Date overtime;

    @ApiModelProperty(value = "救援地址")
    private String rescueaddress;

    @ApiModelProperty(value = "结算方式")
    private String setter;

    @ApiModelProperty(value = "赔款公司")
    private String company;

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

    @ApiModelProperty(value = "开单时间")
    @TableField("orderTime")
    private Date orderTime;

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

    public static final String CARINFOID = "carinfoid";

    public static final String STAFFNO = "staffno";

    public static final String RESCUETEAMID = "rescueTeamid";

    public static final String TYPE = "type";

    public static final String WORKTIMES = "worktimes";

    public static final String GETMAN = "getman";

    public static final String WORKDATE = "workdate";

    public static final String NOWDATE = "nowdate";

    public static final String ADDRESS = "address";

    public static final String CAR = "car";

    public static final String LICHE = "liche";

    public static final String WORKTIME = "worktime";

    public static final String OVERTIME = "overtime";

    public static final String RESCUEADDRESS = "rescueaddress";

    public static final String SETTER = "setter";

    public static final String COMPANY = "company";

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
