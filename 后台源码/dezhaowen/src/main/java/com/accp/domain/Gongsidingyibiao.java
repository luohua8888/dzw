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
@ApiModel(value="Gongsidingyibiao对象", description="")
public class Gongsidingyibiao extends Model<Gongsidingyibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户公司id")
    private Integer did;

    @ApiModelProperty(value = "单位名称")
    private String dname;

    @ApiModelProperty(value = "单位地址")
    private String daddress;

    @ApiModelProperty(value = "单位简称")
    private String djian;

    @ApiModelProperty(value = "业务电话")
    private String dphoney;

    @ApiModelProperty(value = "投诉电话")
    private String dphonej;

    @ApiModelProperty(value = "网址")
    private String dwaddress;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "开户银行")
    private String dhang;

    @ApiModelProperty(value = "银行账号")
    private String dhangz;

    @ApiModelProperty(value = "短信账号")
    private String dhangd;

    @ApiModelProperty(value = "短信密码")
    private String dmi;

    @ApiModelProperty(value = "商品编号位数")
    private String dshangs;

    @ApiModelProperty(value = "初始加价率")
    private String dchu;

    @ApiModelProperty(value = "商品税率")
    private String dslv;

    @ApiModelProperty(value = "销售金额满")
    private String dxiao;

    @ApiModelProperty(value = "折合税分")
    private String dzhe;

    @ApiModelProperty(value = "积分/元")
    private String djifen;

    @ApiModelProperty(value = "维修看板行数")
    private String dwei;

    @ApiModelProperty(value = "三包申报超期(天)")
    private String dsan;

    @ApiModelProperty(value = "车辆年审提醒(天)")
    private String dche;

    @ApiModelProperty(value = "账号超期提醒(天)")
    private String dzhang;

    @ApiModelProperty(value = "班组备件超期(天)")
    private String dban;

    @ApiModelProperty(value = "配件库超龄提醒(天)")
    private String dpei;

    @ApiModelProperty(value = "站内晚上系数")
    private String dneiw;

    @ApiModelProperty(value = "站外白天系数")
    private String dwaib;

    @ApiModelProperty(value = "站外晚上系数")
    private String dwaiw;

    @ApiModelProperty(value = "备用字段")
    private String d1;

    @ApiModelProperty(value = "备用字段")
    private String d2;

    @ApiModelProperty(value = "备用字段")
    private String d3;


    public static final String DID = "did";

    public static final String DNAME = "dname";

    public static final String DADDRESS = "daddress";

    public static final String DJIAN = "djian";

    public static final String DPHONEY = "dphoney";

    public static final String DPHONEJ = "dphonej";

    public static final String DWADDRESS = "dwaddress";

    public static final String EMAIL = "email";

    public static final String DHANG = "dhang";

    public static final String DHANGZ = "dhangz";

    public static final String DHANGD = "dhangd";

    public static final String DMI = "dmi";

    public static final String DSHANGS = "dshangs";

    public static final String DCHU = "dchu";

    public static final String DSLV = "dslv";

    public static final String DXIAO = "dxiao";

    public static final String DZHE = "dzhe";

    public static final String DJIFEN = "djifen";

    public static final String DWEI = "dwei";

    public static final String DSAN = "dsan";

    public static final String DCHE = "dche";

    public static final String DZHANG = "dzhang";

    public static final String DBAN = "dban";

    public static final String DPEI = "dpei";

    public static final String DNEIW = "dneiw";

    public static final String DWAIB = "dwaib";

    public static final String DWAIW = "dwaiw";

    public static final String D1 = "d1";

    public static final String D2 = "d2";

    public static final String D3 = "d3";

    @Override
    protected Serializable pkVal() {
        return this.did;
    }

}
