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
@ApiModel(value="SysRoleMenu对象", description="")
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "菜单id")
    private Integer menuId;
    @TableField(exist = false)
    private SysMenu sysm;


    public static final String ROLE_ID = "role_id";

    public static final String MENU_ID = "menu_id";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
