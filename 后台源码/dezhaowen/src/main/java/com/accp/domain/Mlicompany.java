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
@ApiModel(value="Mlicompany对象", description="")
public class Mlicompany extends Model<Mlicompany> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "交强险保险公司id")
    @TableId
    private Integer mlicompanyid;

    @ApiModelProperty(value = "交强险保险公司")
    private String mlicompany;

    @ApiModelProperty(value = "备用字段")
    private String mli1;

    @ApiModelProperty(value = "备用字段")
    private String mli2;

    @ApiModelProperty(value = "备用字段")
    private String mli3;


    public static final String MLICOMPANYID = "mlicompanyid";

    public static final String MLICOMPANY = "mlicompany";

    public static final String MLI1 = "mli1";

    public static final String MLI2 = "mli2";

    public static final String MLI3 = "mli3";

    @Override
    protected Serializable pkVal() {
        return this.mlicompanyid;
    }

}
