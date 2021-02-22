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
@ApiModel(value="Jinkouguochang对象", description="")
public class Jinkouguochang extends Model<Jinkouguochang> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
    private Integer jid;

    @ApiModelProperty(value = "进口国产")
    private String jname;

    @ApiModelProperty(value = "备用字段")
    private String j1;

    @ApiModelProperty(value = "备用字段")
    private String j2;

    @ApiModelProperty(value = "备用字段")
    private String j3;


    public static final String JID = "jid";

    public static final String JNAME = "jname";

    public static final String J1 = "j1";

    public static final String J2 = "j2";

    public static final String J3 = "j3";

    @Override
    protected Serializable pkVal() {
        return this.jid;
    }

}
