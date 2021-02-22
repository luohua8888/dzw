package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="Completed对象", description="")
public class Completed extends Model<Completed> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "合格否 1=合格，0=不合格")
    @TableField("yesOrno")
    private Integer yesOrno;

    @ApiModelProperty(value = "预计完工时间")
    private LocalDateTime predicttime;

    @ApiModelProperty(value = "实际完工时间")
    private LocalDateTime nowtime;

    @ApiModelProperty(value = "误工原因")
    private String reason;

    @ApiModelProperty(value = "质检员，与员工表关联")
    private String workid;

    @ApiModelProperty(value = "责任人，与员工表关联")
    private String dutyid;

    @ApiModelProperty(value = "处罚金额")
    private Float price;

    @ApiModelProperty(value = "返工数")
    private Integer count;

    @ApiModelProperty(value = "返工原因")
    private String fgreason;

    @ApiModelProperty(value = "维修或救援id")
    private String wjid;

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

    public static final String YESORNO = "yesOrno";

    public static final String PREDICTTIME = "predicttime";

    public static final String NOWTIME = "nowtime";

    public static final String REASON = "reason";

    public static final String WORKID = "workid";

    public static final String DUTYID = "dutyid";

    public static final String PRICE = "price";

    public static final String COUNT = "count";

    public static final String FGREASON = "fgreason";

    public static final String WJID = "wjid";

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
