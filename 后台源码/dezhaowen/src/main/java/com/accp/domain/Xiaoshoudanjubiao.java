package com.accp.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Xiaoshoudanjubiao对象", description="")
public class Xiaoshoudanjubiao extends Model<Xiaoshoudanjubiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "销售单号")
    private String xiaoshouno;

    @ApiModelProperty(value = "单据类型")
    private String xiaoshoudjlx;

    @ApiModelProperty(value = "结算方式")
    private String xiaoshoujsfs;

    @ApiModelProperty(value = "单据状态")
    private String xiaoshouzt;

    @ApiModelProperty(value = "结算状态")
    private String xiaoshoujszt;

    @ApiModelProperty(value = "结算时间")
    private LocalDate xiaoshoujssj;

    @ApiModelProperty(value = "结算人")
    private String xiaoshoujsr;

    @ApiModelProperty(value = "结算金额")
    private Float xiaoshoujsje;

    @ApiModelProperty(value = "业务类型")
    private String xiaoshouywlx;

    @ApiModelProperty(value = "客户名称")
    private String xiaoshoukhname;

    @ApiModelProperty(value = "车牌号")
    private String xiaoshoucph;

    @ApiModelProperty(value = "车型")
    private String xiaoshoucx;

    @ApiModelProperty(value = "车架号")
    private String xiaoshoucjh;

    @ApiModelProperty(value = "联系电话")
    private String xiaoshoulxdh;

    @ApiModelProperty(value = "保险公司")
    private String xiaoshoubxgs;

    @ApiModelProperty(value = "赔款公司")
    private String xiaoshoupkgs;

    @ApiModelProperty(value = "对方车牌")
    private String xiaoshoudfcp;

    @ApiModelProperty(value = "服务顾问")
    private String xiaoshoufwgw;

    @ApiModelProperty(value = "完工时间")
    private LocalDate xiaoshouwgsj;

    @ApiModelProperty(value = "备注")
    private String xiaoshoubz;

    @ApiModelProperty(value = "备用字段")
    private String xiao1;

    @ApiModelProperty(value = "备用字段")
    private String xiao2;

    @ApiModelProperty(value = "备用字段")
    private String xiao3;


    public static final String XIAOSHOUNO = "xiaoshouno";

    public static final String XIAOSHOUDJLX = "xiaoshoudjlx";

    public static final String XIAOSHOUJSFS = "xiaoshoujsfs";

    public static final String XIAOSHOUZT = "xiaoshouzt";

    public static final String XIAOSHOUJSZT = "xiaoshoujszt";

    public static final String XIAOSHOUJSSJ = "xiaoshoujssj";

    public static final String XIAOSHOUJSR = "xiaoshoujsr";

    public static final String XIAOSHOUJSJE = "xiaoshoujsje";

    public static final String XIAOSHOUYWLX = "xiaoshouywlx";

    public static final String XIAOSHOUKHNAME = "xiaoshoukhname";

    public static final String XIAOSHOUCPH = "xiaoshoucph";

    public static final String XIAOSHOUCX = "xiaoshoucx";

    public static final String XIAOSHOUCJH = "xiaoshoucjh";

    public static final String XIAOSHOULXDH = "xiaoshoulxdh";

    public static final String XIAOSHOUBXGS = "xiaoshoubxgs";

    public static final String XIAOSHOUPKGS = "xiaoshoupkgs";

    public static final String XIAOSHOUDFCP = "xiaoshoudfcp";

    public static final String XIAOSHOUFWGW = "xiaoshoufwgw";

    public static final String XIAOSHOUWGSJ = "xiaoshouwgsj";

    public static final String XIAOSHOUBZ = "xiaoshoubz";

    public static final String XIAO1 = "xiao1";

    public static final String XIAO2 = "xiao2";

    public static final String XIAO3 = "xiao3";

    @Override
    protected Serializable pkVal() {
        return this.xiaoshouno;
    }

}
