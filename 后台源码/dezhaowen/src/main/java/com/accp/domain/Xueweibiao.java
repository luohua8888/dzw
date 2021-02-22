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
@ApiModel(value="Xueweibiao对象", description="")
public class Xueweibiao extends Model<Xueweibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer collegeid;

    @ApiModelProperty(value = "学位")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String co1;

    @ApiModelProperty(value = "备用字段")
    private String co2;

    @ApiModelProperty(value = "备用字段")
    private String co3;


    public static final String COLLEGEID = "collegeid";

    public static final String NAME = "name";

    public static final String CO1 = "co1";

    public static final String CO2 = "co2";

    public static final String CO3 = "co3";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
