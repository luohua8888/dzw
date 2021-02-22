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
@ApiModel(value="Factory对象", description="")
public class Factory extends Model<Factory> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "厂id")
    private Integer factoryid;

    @ApiModelProperty(value = "厂名")
    private String factoryname;

    @ApiModelProperty(value = "备用字段")
    private String f1;

    @ApiModelProperty(value = "备用字段")
    private String f2;

    @ApiModelProperty(value = "备用字段")
    private String f3;


    public static final String FACTORYID = "factoryid";

    public static final String FACTORYNAME = "factoryname";

    public static final String F1 = "f1";

    public static final String F2 = "f2";

    public static final String F3 = "f3";

    @Override
    protected Serializable pkVal() {
        return this.factoryid;
    }

}
