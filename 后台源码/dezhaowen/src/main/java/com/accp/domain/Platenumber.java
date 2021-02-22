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
@ApiModel(value="Platenumber对象", description="")
public class Platenumber extends Model<Platenumber> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "车牌id")
    private Integer plateid;

    @ApiModelProperty(value = "车牌名")
    private String platename;

    @ApiModelProperty(value = "备用字段")
    private String pla1;

    @ApiModelProperty(value = "备用字段")
    private String pla2;

    @ApiModelProperty(value = "备用字段")
    private String pla3;


    public static final String PLATEID = "plateid";

    public static final String PLATENAME = "platename";

    public static final String PLA1 = "pla1";

    public static final String PLA2 = "pla2";

    public static final String PLA3 = "pla3";

    @Override
    protected Serializable pkVal() {
        return this.plateid;
    }

}
