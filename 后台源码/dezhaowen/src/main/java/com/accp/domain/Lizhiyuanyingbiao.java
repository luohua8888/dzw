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
@ApiModel(value="Lizhiyuanyingbiao对象", description="")
public class Lizhiyuanyingbiao extends Model<Lizhiyuanyingbiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "离职日期")
    private String ytime;

    @ApiModelProperty(value = "离职原因")
    private String yreason;

    @ApiModelProperty(value = "员工编号")
    private Integer yid;

    @ApiModelProperty(value = "备用字段")
    private String y1;

    @ApiModelProperty(value = "备用字段")
    private String y2;

    @ApiModelProperty(value = "备用字段")
    private String y3;


    public static final String YTIME = "ytime";

    public static final String YREASON = "yreason";

    public static final String YID = "yid";

    public static final String Y1 = "y1";

    public static final String Y2 = "y2";

    public static final String Y3 = "y3";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
