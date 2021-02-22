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
@ApiModel(value="Mendianbiao对象", description="")
public class Mendianbiao extends Model<Mendianbiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "门店id")
    private Integer mdid;

    @ApiModelProperty(value = "门店代码")
    private String mddm;

    @ApiModelProperty(value = "门店名称")
    private String mdname;

    @ApiModelProperty(value = "所在城市")
    private String szcs;

    @ApiModelProperty(value = "备用字段")
    private String md1;

    @ApiModelProperty(value = "备用字段")
    private String md2;

    @ApiModelProperty(value = "备用字段")
    private String md3;


    public static final String MDID = "mdid";

    public static final String MDDM = "mddm";

    public static final String MDNAME = "mdname";

    public static final String SZCS = "szcs";

    public static final String MD1 = "md1";

    public static final String MD2 = "md2";

    public static final String MD3 = "md3";

    @Override
    protected Serializable pkVal() {
        return this.mdid;
    }

}
