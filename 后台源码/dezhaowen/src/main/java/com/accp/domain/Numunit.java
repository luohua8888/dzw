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
@ApiModel(value="Numunit对象", description="")
public class Numunit extends Model<Numunit> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "单位id")
    private Integer numunitid;

    @ApiModelProperty(value = "单位")
    private String numunit;

    @ApiModelProperty(value = "备用字段")
    private String num1;

    @ApiModelProperty(value = "备用字段")
    private String num2;

    @ApiModelProperty(value = "备用字段")
    private String num3;


    public static final String NUMUNITID = "numunitid";

    public static final String NUMUNIT = "numunit";

    public static final String NUM1 = "num1";

    public static final String NUM2 = "num2";

    public static final String NUM3 = "num3";

    @Override
    protected Serializable pkVal() {
        return this.numunitid;
    }

}
