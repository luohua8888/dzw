package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

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
@ApiModel(value="SysMenu对象", description="")
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "菜单ID")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Integer menuId;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "父菜单ID")
    private Integer parentId;

    @ApiModelProperty(value = "显示顺序")
    private String orderNum;

    @ApiModelProperty(value = "请求地址")
    private String url;

    @ApiModelProperty(value = "菜单类型")
    private String menuType;

    @ApiModelProperty(value = "菜单状态")
    private String visible;

    @ApiModelProperty(value = "权限标识")
    private String perms;

    @ApiModelProperty(value = "创建时间")
    private LocalDate createTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "备用字段")
    private String men1;

    @ApiModelProperty(value = "备用字段")
    private String men2;

    @ApiModelProperty(value = "备用字段")
    private String men3;
    @ApiModelProperty(value = "字节的集合")
    private List<SysMenu> children;

    private boolean l;


    public static final String MENU_ID = "menu_id";

    public static final String MENU_NAME = "menu_name";

    public static final String PARENT_ID = "parent_id";

    public static final String ORDER_NUM = "order_num";

    public static final String URL = "url";

    public static final String MENU_TYPE = "menu_type";

    public static final String VISIBLE = "visible";

    public static final String PERMS = "perms";

    public static final String CREATE_TIME = "create_time";

    public static final String REMARK = "remark";

    public static final String MEN1 = "men1";

    public static final String MEN2 = "men2";

    public static final String MEN3 = "men3";
    

    @Override
    protected Serializable pkVal() {
        return this.menuId;
    }

}
