package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Earning对象", description="")
public class Earning extends Model<Earning> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "收入id")
    @TableId
    private Integer earningid;

    @ApiModelProperty(value = "收入分类")
    private String earningname;

    @ApiModelProperty(value = "备用字段")
    private String ear1;

    @ApiModelProperty(value = "备用字段")
    private String car2;

    @ApiModelProperty(value = "备用字段")
    private String car3;


    public static final String EARNINGID = "earningid";

    public static final String EARNINGNAME = "earningname";

    public static final String EAR1 = "ear1";

    public static final String CAR2 = "car2";

    public static final String CAR3 = "car3";

    @Override
    protected Serializable pkVal() {
        return this.earningid;
    }

}
