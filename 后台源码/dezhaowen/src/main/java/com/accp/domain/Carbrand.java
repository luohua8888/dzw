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
@ApiModel(value="Carbrand对象", description="")
public class Carbrand extends Model<Carbrand> {

    private static final long serialVersionUID=1L;
    @TableId()
    @ApiModelProperty(value = "车辆编码")
    private String carcoding;

    @ApiModelProperty(value = "品牌名称")
    private String brandname;

    @ApiModelProperty(value = "首字母")
    private String initial;

    @ApiModelProperty(value = "备用字段")
    private String brand1;

    @ApiModelProperty(value = "备用字段")
    private String brand2;

    @ApiModelProperty(value = "备用字段")
    private String brand3;


    public static final String CARCODING = "carcoding";

    public static final String BRANDNAME = "brandname";

    public static final String INITIAL = "initial";

    public static final String BRAND1 = "brand1";

    public static final String BRAND2 = "brand2";

    public static final String BRAND3 = "brand3";

    @Override
    protected Serializable pkVal() {
        return this.carcoding;
    }

}
