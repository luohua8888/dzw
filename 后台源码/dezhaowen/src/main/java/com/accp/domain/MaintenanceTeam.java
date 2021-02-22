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
@ApiModel(value="MaintenanceTeam对象", description="")
public class MaintenanceTeam extends Model<MaintenanceTeam> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "班组编码")
    private String teamid;

    @ApiModelProperty(value = "班组名称")
    private String teamname;

    @ApiModelProperty(value = "班组权重")
    private String teamweight;

    @ApiModelProperty(value = "班组分类编码")
    private String classificationid;

    @ApiModelProperty(value = "备用字段")
    private String tem1;

    @ApiModelProperty(value = "备用字段")
    private String tem2;

    @ApiModelProperty(value = "备用字段")
    private String tem3;


    public static final String TEAMID = "teamid";

    public static final String TEAMNAME = "teamname";

    public static final String TEAMWEIGHT = "teamweight";

    public static final String CLASSIFICATIONID = "classificationid";

    public static final String TEM1 = "tem1";

    public static final String TEM2 = "tem2";

    public static final String TEM3 = "tem3";

    @Override
    protected Serializable pkVal() {
        return this.teamid;
    }

}
