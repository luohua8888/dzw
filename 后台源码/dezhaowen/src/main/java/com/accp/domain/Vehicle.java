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
@ApiModel(value="Vehicle对象", description="")
public class Vehicle extends Model<Vehicle> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "车型id")
    private Integer vehicleid;

    @ApiModelProperty(value = "车型名称")
    private String vehiclename;

    @ApiModelProperty(value = "参考价格")
    private String referenceprice;

    @ApiModelProperty(value = "车辆年款")
    private String caryear;

    @ApiModelProperty(value = "排气量")
    private String gasd;

    @ApiModelProperty(value = "进口国产")
    private String iod;

    @ApiModelProperty(value = "燃油标号")
    private String oilnum;

    @ApiModelProperty(value = "四驱类型")
    private String fourtype;

    @ApiModelProperty(value = "车辆编码")
    private String carcoding;

    @ApiModelProperty(value = "备用字段")
    private String ve1;

    @ApiModelProperty(value = "备用字段")
    private String ve2;

    @ApiModelProperty(value = "备用字段")
    private String ve3;


    public static final String VEHICLEID = "vehicleid";

    public static final String VEHICLENAME = "vehiclename";

    public static final String REFERENCEPRICE = "referenceprice";

    public static final String CARYEAR = "caryear";

    public static final String GASD = "gasd";

    public static final String IOD = "iod";

    public static final String OILNUM = "oilnum";

    public static final String FOURTYPE = "fourtype";

    public static final String CARCODING = "carcoding";

    public static final String VE1 = "ve1";

    public static final String VE2 = "ve2";

    public static final String VE3 = "ve3";

    @Override
    protected Serializable pkVal() {
        return this.vehicleid;
    }

}
