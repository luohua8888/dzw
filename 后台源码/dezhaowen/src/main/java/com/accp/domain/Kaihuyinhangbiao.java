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
@ApiModel(value="Kaihuyinhangbiao对象", description="")
public class Kaihuyinhangbiao extends Model<Kaihuyinhangbiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer bankid;

    @ApiModelProperty(value = "银行")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String bank1;

    @ApiModelProperty(value = "备用字段")
    private String bank2;

    @ApiModelProperty(value = "备用字段")
    private String bank3;


    public static final String BANKID = "bankid";

    public static final String NAME = "name";

    public static final String BANK1 = "bank1";

    public static final String BANK2 = "bank2";

    public static final String BANK3 = "bank3";

    @Override
    protected Serializable pkVal() {
        return this.bankid;
    }

}
