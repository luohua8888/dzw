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
@ApiModel(value="Gooddata对象", description="")
public class Gooddata extends Model<Gooddata> {

    private static final long serialVersionUID=1L;
    @TableId
    @ApiModelProperty(value = "商品资料id")
    private Integer gooddataid;

    @ApiModelProperty(value = "登记门店外键李艺星的门店表")
    private Integer registershop;

    @ApiModelProperty(value = "照片名")
    private String photoname;

    @ApiModelProperty(value = "商品编码")
    private String goodnum;

    @ApiModelProperty(value = "商品名称")
    private String goodname;

    @ApiModelProperty(value = "商品品牌id")
    private Integer goodbrandid;

    @ApiModelProperty(value = "适用车型")
    private String fitcartype;

    @ApiModelProperty(value = "数量单位id")
    private Integer numunitid;

    @ApiModelProperty(value = "商品大类id")
    private Integer goodbigkindid;

    @ApiModelProperty(value = "收入分类id")
    private Integer earningid;

    @ApiModelProperty(value = "原厂副厂id")
    private Integer ycfcid;

    @ApiModelProperty(value = "商品等级id")
    private Integer goodgradeid;

    @ApiModelProperty(value = "商品产地id")
    private Integer goodaddressid;

    @ApiModelProperty(value = "厂商id")
    private Integer firmid;

    @ApiModelProperty(value = "原厂编码")
    private String ycnum;

    @ApiModelProperty(value = "条形码")
    private String txnum;

    @ApiModelProperty(value = "包装规格")
    private String packing;

    @ApiModelProperty(value = "体积A")
    private String volume;

    @ApiModelProperty(value = "毛重")
    private String roughweight;

    @ApiModelProperty(value = "净重")
    private String suttle;

    @ApiModelProperty(value = "加价率")
    private String raprate;

    @ApiModelProperty(value = "互换码")
    private String exchange;

    @ApiModelProperty(value = "售价按id")
    private Integer paytoid;

    @ApiModelProperty(value = "标准价")
    private Float standardprice;

    @ApiModelProperty(value = "会员价")
    private Float memberprice;

    @ApiModelProperty(value = "VIP价")
    private Float vipprice;

    @ApiModelProperty(value = "协议价")
    private Float protocol;

    @ApiModelProperty(value = "索赔价")
    private Float claimprice;

    @ApiModelProperty(value = "保险价")
    private Float insuranceprice;

    @ApiModelProperty(value = "备用字段")
    private String good1;

    @ApiModelProperty(value = "备用字段")
    private String good2;

    @ApiModelProperty(value = "备用字段")
    private String good3;


    public static final String GOODDATAID = "gooddataid";

    public static final String REGISTERSHOP = "registershop";

    public static final String PHOTONAME = "photoname";

    public static final String GOODNUM = "goodnum";

    public static final String GOODNAME = "goodname";

    public static final String GOODBRANDID = "goodbrandid";

    public static final String FITCARTYPE = "fitcartype";

    public static final String NUMUNITID = "numunitid";

    public static final String GOODBIGKINDID = "goodbigkindid";

    public static final String EARNINGID = "earningid";

    public static final String YCFCID = "ycfcid";

    public static final String GOODGRADEID = "goodgradeid";

    public static final String GOODADDRESSID = "goodaddressid";

    public static final String FIRMID = "firmid";

    public static final String YCNUM = "ycnum";

    public static final String TXNUM = "txnum";

    public static final String PACKING = "packing";

    public static final String VOLUME = "volume";

    public static final String ROUGHWEIGHT = "roughweight";

    public static final String SUTTLE = "suttle";

    public static final String RAPRATE = "raprate";

    public static final String EXCHANGE = "exchange";

    public static final String PAYTOID = "paytoid";

    public static final String STANDARDPRICE = "standardprice";

    public static final String MEMBERPRICE = "memberprice";

    public static final String VIPPRICE = "vipprice";

    public static final String PROTOCOL = "protocol";

    public static final String CLAIMPRICE = "claimprice";

    public static final String INSURANCEPRICE = "insuranceprice";

    public static final String GOOD1 = "good1";

    public static final String GOOD2 = "good2";

    public static final String GOOD3 = "good3";

    @Override
    protected Serializable pkVal() {
        return this.gooddataid;
    }

}
