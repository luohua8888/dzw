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
@ApiModel(value="Payto对象", description="")
public class Payto extends Model<Payto> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "售价按id")
    private Integer paytoid;

    @ApiModelProperty(value = "售价按")
    private String payto;

    @ApiModelProperty(value = "备用字段")
    private String pay1;

    @ApiModelProperty(value = "备用字段")
    private String pay2;

    @ApiModelProperty(value = "备用字段")
    private String pay3;


    public static final String PAYTOID = "paytoid";

    public static final String PAYTO = "payto";

    public static final String PAY1 = "pay1";

    public static final String PAY2 = "pay2";

    public static final String PAY3 = "pay3";

    @Override
    protected Serializable pkVal() {
        return this.paytoid;
    }

}
