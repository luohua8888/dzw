package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="SysRole对象", description="")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "角色id")
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "角色状态")
    private String status;

    @ApiModelProperty(value = "删除标志")
    private String delFlag;

    @ApiModelProperty(value = "创建时间")
    private LocalDate createTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "备用字段")
    private String role1;

    @ApiModelProperty(value = "备用字段")
    private String role2;

    @ApiModelProperty(value = "备用字段")
    private String role3;


    public static final String ROLE_ID = "role_id";

    public static final String ROLE_NAME = "role_name";

    public static final String STATUS = "status";

    public static final String DEL_FLAG = "del_flag";

    public static final String CREATE_TIME = "create_time";

    public static final String REMARK = "remark";

    public static final String ROLE1 = "role1";

    public static final String ROLE2 = "role2";

    public static final String ROLE3 = "role3";

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

}
