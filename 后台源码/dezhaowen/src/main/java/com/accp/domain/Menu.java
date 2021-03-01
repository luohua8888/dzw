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
 * 菜单表
 * </p>
 *
 * @author ytang
 * @since 2021-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Menu对象", description="菜单表")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "菜单id")
    private Integer menuid;

    @ApiModelProperty(value = "菜单名称")
    private String menuname;

    @ApiModelProperty(value = "父菜单id")
    private Integer fmid;


    public static final String MENUID = "menuid";

    public static final String MENUNAME = "menuname";

    public static final String FMID = "fmid";

    @Override
    protected Serializable pkVal() {
        return this.menuid;
    }

}
