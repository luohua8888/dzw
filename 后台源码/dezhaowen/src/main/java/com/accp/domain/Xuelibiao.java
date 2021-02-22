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
@ApiModel(value="Xuelibiao对象", description="")
public class Xuelibiao extends Model<Xuelibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer educationid;

    @ApiModelProperty(value = "学历")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String ed1;

    @ApiModelProperty(value = "备用字段")
    private String ed2;

    @ApiModelProperty(value = "备用字段")
    private String ed3;


    public static final String EDUCATIONID = "educationid";

    public static final String NAME = "name";

    public static final String ED1 = "ed1";

    public static final String ED2 = "ed2";

    public static final String ED3 = "ed3";

    @Override
    protected Serializable pkVal() {
        return this.educationid;
    }

}
