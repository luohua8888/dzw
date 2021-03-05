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
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserRole对象", description="")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID=1L;

    private Integer userid;

    private Integer roleid;


    public static final String USERID = "userid";

    public static final String ROLEID = "roleid";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
