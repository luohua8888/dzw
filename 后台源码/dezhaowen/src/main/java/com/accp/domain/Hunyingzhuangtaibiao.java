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
@ApiModel(value="Hunyingzhuangtaibiao对象", description="")
public class Hunyingzhuangtaibiao extends Model<Hunyingzhuangtaibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer marriageid;

    @ApiModelProperty(value = "婚姻状况")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String mar1;

    @ApiModelProperty(value = "备用字段")
    private String mar2;

    @ApiModelProperty(value = "备用字段")
    private String mar3;


    public static final String MARRIAGEID = "marriageid";

    public static final String NAME = "name";

    public static final String MAR1 = "mar1";

    public static final String MAR2 = "mar2";

    public static final String MAR3 = "mar3";

    @Override
    protected Serializable pkVal() {
        return this.marriageid;
    }

}
