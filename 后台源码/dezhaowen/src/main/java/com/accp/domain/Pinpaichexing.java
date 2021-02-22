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
@ApiModel(value="Pinpaichexing对象", description="")
public class Pinpaichexing extends Model<Pinpaichexing> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编码")
    private Integer pid;

    @ApiModelProperty(value = "品牌名称")
    private String pname;

    @ApiModelProperty(value = "首字母")
    private String shouzimu;

    @ApiModelProperty(value = "备用字段")
    private String p1;

    @ApiModelProperty(value = "备用字段")
    private String p2;

    @ApiModelProperty(value = "备用字段")
    private String p3;


    public static final String PID = "pid";

    public static final String PNAME = "pname";

    public static final String SHOUZIMU = "shouzimu";

    public static final String P1 = "p1";

    public static final String P2 = "p2";

    public static final String P3 = "p3";

    @Override
    protected Serializable pkVal() {
        return this.pid;
    }

}
