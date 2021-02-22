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
@ApiModel(value="Mendianfenleibiao对象", description="")
public class Mendianfenleibiao extends Model<Mendianfenleibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号id")
    private Integer mlid;

    @ApiModelProperty(value = "门店分类姓名")
    private String mlname;

    @ApiModelProperty(value = "备用字段")
    private String m1;

    @ApiModelProperty(value = "备用字段")
    private String m2;

    @ApiModelProperty(value = "备用字段")
    private String m3;


    public static final String MLID = "mlid";

    public static final String MLNAME = "mlname";

    public static final String M1 = "m1";

    public static final String M2 = "m2";

    public static final String M3 = "m3";

    @Override
    protected Serializable pkVal() {
        return this.mlid;
    }

}
