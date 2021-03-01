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
@ApiModel(value="Oiltype对象", description="")
public class Oiltype extends Model<Oiltype> {

    private static final long serialVersionUID=1L;
    @TableId
    @ApiModelProperty(value = "燃油类别id")
    private Integer oiltypeid;

    @ApiModelProperty(value = "燃油类别")
    private String oiltype;

    @ApiModelProperty(value = "备用字段")
    private String o1;

    @ApiModelProperty(value = "备用字段")
    private String o2;

    @ApiModelProperty(value = "备用字段")
    private String o3;


    public static final String OILTYPEID = "oiltypeid";

    public static final String OILTYPE = "oiltype";

    public static final String O1 = "o1";

    public static final String O2 = "o2";

    public static final String O3 = "o3";

    @Override
    protected Serializable pkVal() {
        return this.oiltypeid;
    }

}
