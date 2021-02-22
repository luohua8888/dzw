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
@ApiModel(value="Customertype对象", description="")
public class Customertype extends Model<Customertype> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "客户类别id")
    private Integer customerid;

    @ApiModelProperty(value = "客户类别")
    private String customertype;

    @ApiModelProperty(value = "备用字段")
    private String cus1;

    @ApiModelProperty(value = "备用字段")
    private String cus2;

    @ApiModelProperty(value = "备用字段")
    private String cus3;


    public static final String CUSTOMERID = "customerid";

    public static final String CUSTOMERTYPE = "customertype";

    public static final String CUS1 = "cus1";

    public static final String CUS2 = "cus2";

    public static final String CUS3 = "cus3";

    @Override
    protected Serializable pkVal() {
        return this.customerid;
    }

}
