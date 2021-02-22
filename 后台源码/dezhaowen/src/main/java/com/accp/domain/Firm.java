package com.accp.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Firm对象", description="")
public class Firm extends Model<Firm> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "厂商id")
    private Integer firmid;

    @ApiModelProperty(value = "厂商代码")
    private String firmnum;

    @ApiModelProperty(value = "厂商名称")
    private String firmname;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "经营情况")
    private String business;

    @ApiModelProperty(value = "网址")
    private String url;

    @ApiModelProperty(value = "开户行")
    private String openbank;

    @ApiModelProperty(value = "银行账号")
    private String bankaccount;

    @ApiModelProperty(value = "付款方式id")
    private Integer paymentid;

    @ApiModelProperty(value = "厂商等级id")
    private Integer firmgradeid;

    @ApiModelProperty(value = "经营品牌")
    private String managebrand;

    @ApiModelProperty(value = "厂商类别id")
    private Integer firmtypeid;

    @ApiModelProperty(value = "联系人id")
    private Integer linkmanid;

    @ApiModelProperty(value = "账期(天)")
    private Integer debttime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "照片")
    private String photo;

    @ApiModelProperty(value = "备用字段")
    private String fir1;

    @ApiModelProperty(value = "备用字段")
    private String fir2;

    @ApiModelProperty(value = "备用字段")
    private String fir3;


    public static final String FIRMID = "firmid";

    public static final String FIRMNUM = "firmnum";

    public static final String FIRMNAME = "firmname";

    public static final String ADDRESS = "address";

    public static final String BUSINESS = "business";

    public static final String URL = "url";

    public static final String OPENBANK = "openbank";

    public static final String BANKACCOUNT = "bankaccount";

    public static final String PAYMENTID = "paymentid";

    public static final String FIRMGRADEID = "firmgradeid";

    public static final String MANAGEBRAND = "managebrand";

    public static final String FIRMTYPEID = "firmtypeid";

    public static final String LINKMANID = "linkmanid";

    public static final String DEBTTIME = "debttime";

    public static final String REMARK = "remark";

    public static final String PHOTO = "photo";

    public static final String FIR1 = "fir1";

    public static final String FIR2 = "fir2";

    public static final String FIR3 = "fir3";

    @Override
    protected Serializable pkVal() {
        return this.firmid;
    }

}
