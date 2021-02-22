package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@ApiModel(value="Cashier对象", description="")
public class Cashier extends Model<Cashier> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "收银id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "总金额")
    @TableField("totalNum")
    private Float totalNum;

    @ApiModelProperty(value = "结算状态")
    private String cashierstatic;

    @ApiModelProperty(value = "支付方式")
    @TableField("paymentType")
    private String paymentType;

    @ApiModelProperty(value = "发票表id")
    @TableField("invoiceNo")
    private String invoiceNo;

    @ApiModelProperty(value = "结算时间")
    private LocalDateTime cashiertime;

    @ApiModelProperty(value = "员工表id检查该员工的角色是否有权限使用内部券")
    @TableField("staffId")
    private String staffId;

    @ApiModelProperty(value = "挂账金额")
    @TableField("onCredit")
    private Float onCredit;

    @ApiModelProperty(value = "内部免单金额")
    private Float interior;

    @ApiModelProperty(value = "客户编号")
    @TableField("clientId")
    private String clientId;

    @ApiModelProperty(value = "找零")
    private Float change;

    @ApiModelProperty(value = "销售单号")
    @TableField("Number")
    private String Number;

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


    public static final String ID = "id";

    public static final String TOTALNUM = "totalNum";

    public static final String CASHIERSTATIC = "cashierstatic";

    public static final String PAYMENTTYPE = "paymentType";

    public static final String INVOICENO = "invoiceNo";

    public static final String CASHIERTIME = "cashiertime";

    public static final String STAFFID = "staffId";

    public static final String ONCREDIT = "onCredit";

    public static final String INTERIOR = "interior";

    public static final String CLIENTID = "clientId";

    public static final String CHANGE = "change";

    public static final String NUMBER = "Number";

    public static final String OTHERONE = "otherone";

    public static final String OTHERTWO = "othertwo";

    public static final String OTHERTHREE = "otherthree";

    public static final String OTHERFOUR = "otherfour";

    public static final String OTHERFIVE = "otherfive";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
