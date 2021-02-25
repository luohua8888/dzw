package com.accp.domain;

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
@ApiModel(value="Weixiubiao对象", description="")
public class Weixiubiao extends Model<Weixiubiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "项目编码")
    @TableId
    private Integer wid;

    @ApiModelProperty(value = "项目名称")
    private String wname;

    @ApiModelProperty(value = "收入种类")
    private String shourujizhong;

    @ApiModelProperty(value = "项目类别")
    private String xiangmuleibie;

    @ApiModelProperty(value = "备注")
    private String beizhu;

    @ApiModelProperty(value = "标准价")
    private Double bzj;

    @ApiModelProperty(value = "会员价")
    private Double hyj;

    @ApiModelProperty(value = "vip价")
    private Double vipj;

    @ApiModelProperty(value = "协议价")
    private Double xyj;

    @ApiModelProperty(value = "索赔价")
    private Double spj;

    @ApiModelProperty(value = "保险价")
    private Double pxj;

    @ApiModelProperty(value = "备用字段")
    private String w1;

    @ApiModelProperty(value = "备用字段")
    private String w2;

    @ApiModelProperty(value = "备用字段")
    private String w3;


    public static final String WID = "wid";

    public static final String WNAME = "wname";

    public static final String SHOURUJIZHONG = "shourujizhong";

    public static final String XIANGMULEIBIE = "xiangmuleibie";

    public static final String BEIZHU = "beizhu";

    public static final String BZJ = "bzj";

    public static final String HYJ = "hyj";

    public static final String VIPJ = "vipj";

    public static final String XYJ = "xyj";

    public static final String SPJ = "spj";

    public static final String PXJ = "pxj";

    public static final String W1 = "w1";

    public static final String W2 = "w2";

    public static final String W3 = "w3";

    @Override
    protected Serializable pkVal() {
        return this.wid;
    }

}
