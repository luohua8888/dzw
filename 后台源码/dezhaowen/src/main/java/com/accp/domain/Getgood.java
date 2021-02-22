package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Getgood对象", description="")
public class Getgood extends Model<Getgood> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "与物料表关联")
    private Integer goodid;

    @ApiModelProperty(value = "需求数量")
    private Integer count;

    @ApiModelProperty(value = "对应项目")
    private String item;

    @ApiModelProperty(value = "价类")
    @TableField("priceType")
    private String priceType;

    @ApiModelProperty(value = "优惠后单价")
    @TableField("discountsPrice")
    private String discountsPrice;

    @ApiModelProperty(value = "维修或救援id")
    private String wjid;

    @ApiModelProperty(value = "仓库")
    private String warehouse;

    @ApiModelProperty(value = "是否领料0否1是")
    @TableField("isRepair")
    private String isRepair;

    @ApiModelProperty(value = "免单原因")
    private String cause;

    @ApiModelProperty(value = "类别")
    private String type;

    @ApiModelProperty(value = "其它字段1")
    private String otherone;

    @ApiModelProperty(value = "其它字段2")
    private String othertwo;

    @ApiModelProperty(value = "其它字段3")
    private String otherthree;

    @ApiModelProperty(value = "其它字段4")
    private String otherfour;

    @ApiModelProperty(value = "其它字段5")
    private String otherfive;


    public static final String ID = "id";

    public static final String GOODID = "goodid";

    public static final String COUNT = "count";

    public static final String ITEM = "item";

    public static final String PRICETYPE = "priceType";

    public static final String DISCOUNTSPRICE = "discountsPrice";

    public static final String WJID = "wjid";

    public static final String WAREHOUSE = "warehouse";

    public static final String ISREPAIR = "isRepair";

    public static final String CAUSE = "cause";

    public static final String TYPE = "type";

    public static final String OTHERONE = "otherone";

    public static final String OTHERTWO = "othertwo";

    public static final String OTHERTHREE = "otherthree";

    public static final String OTHERFOUR = "otherfour";

    public static final String OTHERFIVE = "otherfive";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
