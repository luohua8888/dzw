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
@ApiModel(value="Goodgrade对象", description="")
public class Goodgrade extends Model<Goodgrade> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品等级id")
    @TableId
    private Integer goodgradeid;

    @ApiModelProperty(value = "商品等级优或良")
    private String goodgrade;

    @ApiModelProperty(value = "备用字段")
    private String good1;

    @ApiModelProperty(value = "备用字段")
    private String good2;

    @ApiModelProperty(value = "备用字段")
    private String good3;


    public static final String GOODGRADEID = "goodgradeid";

    public static final String GOODGRADE = "goodgrade";

    public static final String GOOD1 = "good1";

    public static final String GOOD2 = "good2";

    public static final String GOOD3 = "good3";

    @Override
    protected Serializable pkVal() {
        return this.goodgradeid;
    }

}
