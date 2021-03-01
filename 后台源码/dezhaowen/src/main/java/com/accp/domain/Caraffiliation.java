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
@ApiModel(value="Caraffiliation对象", description="")
public class Caraffiliation extends Model<Caraffiliation> {

    private static final long serialVersionUID=1L;
    @TableId()
    @ApiModelProperty(value = "车辆归属id")
    private Integer caraffiliationid;

    @ApiModelProperty(value = "车辆归属")
    private String caraffiliation;

    @ApiModelProperty(value = "备用字段")
    private String cf1;

    @ApiModelProperty(value = "备用字段")
    private String cf2;

    @ApiModelProperty(value = "备用字段")
    private String cf3;


    public static final String CARAFFILIATIONID = "caraffiliationid";

    public static final String CARAFFILIATION = "caraffiliation";

    public static final String CF1 = "cf1";

    public static final String CF2 = "cf2";

    public static final String CF3 = "cf3";

    @Override
    protected Serializable pkVal() {
        return this.caraffiliationid;
    }

}
