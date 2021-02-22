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
@ApiModel(value="TeamWeight对象", description="")
public class TeamWeight extends Model<TeamWeight> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "班组编码")
    private String teamid;

    @ApiModelProperty(value = "工时费站内白天")
    private Double inam;

    @ApiModelProperty(value = "站内晚上")
    private Double inevening;

    @ApiModelProperty(value = "站外白天")
    private Double outam;

    @ApiModelProperty(value = "站外晚上")
    private Double outevening;

    @ApiModelProperty(value = "在途费白天")
    private Double intransitam;

    @ApiModelProperty(value = "在途费晚上")
    private Double intransitevening;

    @ApiModelProperty(value = "燃油费")
    private Double fuelcost;

    @ApiModelProperty(value = "备用字段")
    private String tea1;

    @ApiModelProperty(value = "备用字段")
    private String tea2;

    @ApiModelProperty(value = "备用字段")
    private String tea3;


    public static final String TEAMID = "teamid";

    public static final String INAM = "inam";

    public static final String INEVENING = "inevening";

    public static final String OUTAM = "outam";

    public static final String OUTEVENING = "outevening";

    public static final String INTRANSITAM = "intransitam";

    public static final String INTRANSITEVENING = "intransitevening";

    public static final String FUELCOST = "fuelcost";

    public static final String TEA1 = "tea1";

    public static final String TEA2 = "tea2";

    public static final String TEA3 = "tea3";

    @Override
    protected Serializable pkVal() {
        return this.teamid;
    }

}
