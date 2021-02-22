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
@ApiModel(value="Payment对象", description="")
public class Payment extends Model<Payment> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "付款方式id")
    private Integer paymentid;

    @ApiModelProperty(value = "付款方式")
    private String payment;

    @ApiModelProperty(value = "备用字段")
    private String pay1;

    @ApiModelProperty(value = "备用字段")
    private String pay2;

    @ApiModelProperty(value = "备用子段")
    private String pay3;


    public static final String PAYMENTID = "paymentid";

    public static final String PAYMENT = "payment";

    public static final String PAY1 = "pay1";

    public static final String PAY2 = "pay2";

    public static final String PAY3 = "pay3";

    @Override
    protected Serializable pkVal() {
        return this.paymentid;
    }

}
