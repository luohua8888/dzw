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
@ApiModel(value="MaintenanceTeamClassification对象", description="")
public class MaintenanceTeamClassification extends Model<MaintenanceTeamClassification> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "班组分类编码")
    private String classificationid;

    @ApiModelProperty(value = "班组分类名称")
    private String classificationname;

    @ApiModelProperty(value = "备用字段")
    private String class1;

    @ApiModelProperty(value = "备用字段")
    private String class2;

    @ApiModelProperty(value = "备用字段")
    private String class3;


    public static final String CLASSIFICATIONID = "classificationid";

    public static final String CLASSIFICATIONNAME = "classificationname";

    public static final String CLASS1 = "class1";

    public static final String CLASS2 = "class2";

    public static final String CLASS3 = "class3";

    @Override
    protected Serializable pkVal() {
        return this.classificationid;
    }

}
