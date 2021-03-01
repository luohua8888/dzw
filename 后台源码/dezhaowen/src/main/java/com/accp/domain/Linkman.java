package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Linkman对象", description="")
public class Linkman extends Model<Linkman> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "联系人id")
    @TableId(type = IdType.AUTO)
    private Integer linkmanid;

    @ApiModelProperty(value = "联系人")
    private String linkman;

    @ApiModelProperty(value = "职位")
    private String position;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "电话")
    private String telephone;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "备用字段")
    private String link1;

    @ApiModelProperty(value = "备用字段")
    private String link2;

    @ApiModelProperty(value = "备用字段")
    private String link3;


    public static final String LINKMANID = "linkmanid";

    public static final String LINKMAN = "linkman";

    public static final String POSITION = "position";

    public static final String PHONE = "phone";

    public static final String TELEPHONE = "telephone";

    public static final String EMAIL = "email";

    public static final String LINK1 = "link1";

    public static final String LINK2 = "link2";

    public static final String LINK3 = "link3";

    @Override
    protected Serializable pkVal() {
        return this.linkmanid;
    }

}
