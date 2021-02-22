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
@ApiModel(value="Firmtype对象", description="")
public class Firmtype extends Model<Firmtype> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "厂商类别id")
    private Integer firmtypeid;

    @ApiModelProperty(value = "厂商类别")
    private String firmtype;

    @ApiModelProperty(value = "父id")
    private Integer dadid;

    @ApiModelProperty(value = "备用字段")
    private String fir1;

    @ApiModelProperty(value = "备用字段")
    private String fir2;

    @ApiModelProperty(value = "备用字段")
    private String fir3;


    public static final String FIRMTYPEID = "firmtypeid";

    public static final String FIRMTYPE = "firmtype";

    public static final String DADID = "dadid";

    public static final String FIR1 = "fir1";

    public static final String FIR2 = "fir2";

    public static final String FIR3 = "fir3";

    @Override
    protected Serializable pkVal() {
        return this.firmtypeid;
    }

}
