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
@ApiModel(value="Chexingdingyibiao对象", description="")
public class Chexingdingyibiao extends Model<Chexingdingyibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "车型品牌")
    private Integer cid;

    @ApiModelProperty(value = "车型名称")
    private String cname;

    @ApiModelProperty(value = "进口国产")
    private String jingkoumingchang;

    @ApiModelProperty(value = "产考价格")
    private Double chankaojiage;

    @ApiModelProperty(value = "车辆年款")
    private Double cheliangniankuan;

    @ApiModelProperty(value = "功率")
    private Integer gonglv;

    @ApiModelProperty(value = "燃油编号")
    private Integer ranyoubianhao;

    @ApiModelProperty(value = "载重")
    private Integer zaizhong;

    @ApiModelProperty(value = "发动机品牌")
    private String fadingjipingpai;

    @ApiModelProperty(value = "备用字段")
    private String c1;

    @ApiModelProperty(value = " 备用字段")
    private String c2;

    @ApiModelProperty(value = "备用字段")
    private String c3;

    @ApiModelProperty(value = "照片")
    private String zhaopian;


    public static final String CID = "cid";

    public static final String CNAME = "cname";

    public static final String JINGKOUMINGCHANG = "jingkoumingchang";

    public static final String CHANKAOJIAGE = "chankaojiage";

    public static final String CHELIANGNIANKUAN = "cheliangniankuan";

    public static final String GONGLV = "gonglv";

    public static final String RANYOUBIANHAO = "ranyoubianhao";

    public static final String ZAIZHONG = "zaizhong";

    public static final String FADINGJIPINGPAI = "fadingjipingpai";

    public static final String C1 = "c1";

    public static final String C2 = "c2";

    public static final String C3 = "c3";

    public static final String ZHAOPIAN = "zhaopian";

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}
