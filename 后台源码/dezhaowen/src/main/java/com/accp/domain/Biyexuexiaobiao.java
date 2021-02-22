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
@ApiModel(value="Biyexuexiaobiao对象", description="")
public class Biyexuexiaobiao extends Model<Biyexuexiaobiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer schoolid;

    @ApiModelProperty(value = "毕业学校")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String school1;

    @ApiModelProperty(value = "备用字段")
    private String school2;

    @ApiModelProperty(value = "备用字段")
    private String school3;


    public static final String SCHOOLID = "schoolid";

    public static final String NAME = "name";

    public static final String SCHOOL1 = "school1";

    public static final String SCHOOL2 = "school2";

    public static final String SCHOOL3 = "school3";

    @Override
    protected Serializable pkVal() {
        return this.schoolid;
    }

}
