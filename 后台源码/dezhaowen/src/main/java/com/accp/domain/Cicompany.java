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
@ApiModel(value="Cicompany对象", description="")
public class Cicompany extends Model<Cicompany> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商业保险公司id")
    private Integer cicompanyid;

    @ApiModelProperty(value = "商业保险公司")
    private String cicompany;

    @ApiModelProperty(value = "备用字段")
    private String cm1;

    @ApiModelProperty(value = "备用字段")
    private String cm2;

    @ApiModelProperty(value = "备用字段")
    private String cm3;


    public static final String CICOMPANYID = "cicompanyid";

    public static final String CICOMPANY = "cicompany";

    public static final String CM1 = "cm1";

    public static final String CM2 = "cm2";

    public static final String CM3 = "cm3";

    @Override
    protected Serializable pkVal() {
        return this.cicompanyid;
    }

}
