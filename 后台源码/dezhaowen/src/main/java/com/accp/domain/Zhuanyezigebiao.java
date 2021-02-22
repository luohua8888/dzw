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
@ApiModel(value="Zhuanyezigebiao对象", description="")
public class Zhuanyezigebiao extends Model<Zhuanyezigebiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer specialtynid;

    @ApiModelProperty(value = "专业")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String spe1;

    @ApiModelProperty(value = "备用字段")
    private String spe2;

    @ApiModelProperty(value = "备用字段")
    private String spe3;


    public static final String SPECIALTYNID = "specialtynid";

    public static final String NAME = "name";

    public static final String SPE1 = "spe1";

    public static final String SPE2 = "spe2";

    public static final String SPE3 = "spe3";

    @Override
    protected Serializable pkVal() {
        return this.specialtynid;
    }

}
