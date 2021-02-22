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
@ApiModel(value="TechnicianLevel对象", description="")
public class TechnicianLevel extends Model<TechnicianLevel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "等级编号")
    private String levelid;

    @ApiModelProperty(value = "等级名称")
    private String levelname;

    @ApiModelProperty(value = "提成权重")
    private String commissionweight;

    @ApiModelProperty(value = "备用字段")
    private String leve1;

    @ApiModelProperty(value = "备用字段")
    private String leve2;

    @ApiModelProperty(value = "备用字段")
    private String leve3;


    public static final String LEVELID = "levelid";

    public static final String LEVELNAME = "levelname";

    public static final String COMMISSIONWEIGHT = "commissionweight";

    public static final String LEVE1 = "leve1";

    public static final String LEVE2 = "leve2";

    public static final String LEVE3 = "leve3";

    @Override
    protected Serializable pkVal() {
        return this.levelid;
    }

}
