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
@ApiModel(value="Mingzubiao对象", description="")
public class Mingzubiao extends Model<Mingzubiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer nationid;

    @ApiModelProperty(value = "民族")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String nat1;

    @ApiModelProperty(value = "备用字段")
    private String nat2;

    @ApiModelProperty(value = "备用字段")
    private String nat3;


    public static final String NATIONID = "nationid";

    public static final String NAME = "name";

    public static final String NAT1 = "nat1";

    public static final String NAT2 = "nat2";

    public static final String NAT3 = "nat3";

    @Override
    protected Serializable pkVal() {
        return this.nationid;
    }

}
