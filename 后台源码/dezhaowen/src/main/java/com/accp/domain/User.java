package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="User对象", description="")
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "账户")
    private String user;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "描述")
    private String miaoshu;

    @ApiModelProperty(value = "备用字段")
    private String u1;

    @ApiModelProperty(value = "备用字段")
    private String u2;

    @ApiModelProperty(value = "备用字段")
    private String u3;

    @TableField(exist = false)
    private String roleid;

    public static final String USER = "user";

    public static final String PWD = "pwd";

    public static final String MIAOSHU = "miaoshu";

    public static final String U1 = "u1";

    public static final String U2 = "u2";

    public static final String U3 = "u3";

    @Override
    protected Serializable pkVal() {
        return this.user;
    }

}
