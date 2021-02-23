package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author ytang
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FieldVehicles对象", description="")
public class FieldVehicles extends Model<FieldVehicles> {

    private static final long serialVersionUID=1L;

    @TableField(exist = false)
    private String recarnumber;
    @TableField(exist = false)
    private MaintenanceTeam maintenanceTeam;
    @ApiModelProperty(value = "车牌号")
    private String carnumber;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "车型")
    private String model;

    @ApiModelProperty(value = "当前里程")
    private Integer currentmileage;

    @ApiModelProperty(value = "归属班组")
    private String teamid;

    @ApiModelProperty(value = "备用字段")
    private String car1;

    @ApiModelProperty(value = "备用字段")
    private String car2;

    @ApiModelProperty(value = "备用字段")
    private String car3;


    public static final String CARNUMBER = "carnumber";

    public static final String BRAND = "brand";

    public static final String MODEL = "model";

    public static final String CURRENTMILEAGE = "currentmileage";

    public static final String TEAMID = "teamid";

    public static final String CAR1 = "car1";

    public static final String CAR2 = "car2";

    public static final String CAR3 = "car3";

    @Override
    protected Serializable pkVal() {
        return this.carnumber;
    }

}
