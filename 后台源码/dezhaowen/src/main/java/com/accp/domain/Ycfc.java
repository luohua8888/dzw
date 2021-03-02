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
@ApiModel(value="Ycfc对象", description="")
public class Ycfc extends Model<Ycfc> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "原厂副厂id")
    @TableId
    private Integer ycfcid;

    @ApiModelProperty(value = "原厂副厂")
    private String ycfc;

    @ApiModelProperty(value = "备用字段")
    private String yc1;

    @ApiModelProperty(value = "备用字段")
    private String yc2;

    @ApiModelProperty(value = "备用字段")
    private String yc3;


    public static final String YCFCID = "ycfcid";

    public static final String YCFC = "ycfc";

    public static final String YC1 = "yc1";

    public static final String YC2 = "yc2";

    public static final String YC3 = "yc3";

    @Override
    protected Serializable pkVal() {
        return this.ycfcid;
    }

}
