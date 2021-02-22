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
@ApiModel(value="ItemRepair对象", description="")
public class ItemRepair extends Model<ItemRepair> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "是救援还是维修，救援=0")
    @TableField("isRepair")
    private Integer isRepair;

    @ApiModelProperty(value = "救援或者维修表id")
    private Integer wjid;

    @ApiModelProperty(value = "项目id")
    private Integer itemid;

    @ApiModelProperty(value = "班组id")
    private Integer teamid;

    @ApiModelProperty(value = "数量")
    private Integer count;

    @ApiModelProperty(value = "价类")
    @TableField("priceType")
    private String priceType;

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

    public static final String ISREPAIR = "isRepair";

    public static final String WJID = "wjid";

    public static final String ITEMID = "itemid";

    public static final String TEAMID = "teamid";

    public static final String COUNT = "count";

    public static final String PRICETYPE = "priceType";

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
