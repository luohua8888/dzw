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
@ApiModel(value="Zhidubiao对象", description="")
public class Zhidubiao extends Model<Zhidubiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer organizationid;

    @ApiModelProperty(value = "编制")
    private String name;

    @ApiModelProperty(value = "备用字段")
    private String org1;

    @ApiModelProperty(value = "备用字段")
    private String org2;

    @ApiModelProperty(value = "备用字段")
    private String org3;


    public static final String ORGANIZATIONID = "organizationid";

    public static final String NAME = "name";

    public static final String ORG1 = "org1";

    public static final String ORG2 = "org2";

    public static final String ORG3 = "org3";

    @Override
    protected Serializable pkVal() {
        return this.organizationid;
    }

}
