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
@ApiModel(value="Gangweibiao对象", description="")
public class Gangweibiao extends Model<Gangweibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "岗位编码")
    private Integer gid;

    @ApiModelProperty(value = "岗位名称")
    private String gname;

    @ApiModelProperty(value = "备用字段")
    private String g1;

    @ApiModelProperty(value = "备用字段")
    private String g2;

    @ApiModelProperty(value = "备用字段")
    private String g3;


    public static final String GID = "gid";

    public static final String GNAME = "gname";

    public static final String G1 = "g1";

    public static final String G2 = "g2";

    public static final String G3 = "g3";

    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}
