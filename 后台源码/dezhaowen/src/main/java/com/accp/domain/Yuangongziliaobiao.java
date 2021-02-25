package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Yuangongziliaobiao对象", description="")
public class Yuangongziliaobiao extends Model<Yuangongziliaobiao> {

    private static final long serialVersionUID=1L;
    @TableId("yid")
    @ApiModelProperty(value = "员工编号")
    private Integer yid;

    @ApiModelProperty(value = "员工姓名")
    private String yname;

    @ApiModelProperty(value = "员工性别")
    private String ysex;

    @ApiModelProperty(value = "员工职位")
    private String yposition;

    @ApiModelProperty(value = "身体状况")
    private String yhealth;

    @ApiModelProperty(value = "登录账号")
    private String yloginemp;

    @ApiModelProperty(value = "身高")
    private String yheigth;

    @ApiModelProperty(value = "籍贯id")
    private Integer ynativplaceid;

    @ApiModelProperty(value = "民族id")
    private Integer ynationid;

    @ApiModelProperty(value = "毕业学校id")
    private Integer yschoolid;

    @ApiModelProperty(value = "专业id")
    private Integer yspecialtyid;

    @ApiModelProperty(value = "专业资格id")
    private Integer yspecialtynid;

    @ApiModelProperty(value = "属性")
    private String yattribute;

    @ApiModelProperty(value = "学位id")
    private Integer ycollegeid;

    @ApiModelProperty(value = "编制id")
    private Integer yorganizationid;

    @ApiModelProperty(value = "身份证号")
    private String ynumber;

    @ApiModelProperty(value = "户口地址")
    private String yaddressh;

    @ApiModelProperty(value = "现住地址")
    private String yaddressx;

    @ApiModelProperty(value = "联系电话")
    private String yphonenumber;

    @ApiModelProperty(value = "手机")
    private String yphone;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "开户银行id")
    private Integer ybankid;

    @ApiModelProperty(value = "银行账号")
    private String ybankphone;

    @ApiModelProperty(value = "紧急联系人")
    private String yjname;

    @ApiModelProperty(value = "紧急联系电话")
    private String yjphone;

    @ApiModelProperty(value = "入职日期")
    private String ystarttime;

    @ApiModelProperty(value = "试用到期")
    private String yendtime;

    @ApiModelProperty(value = "出生日期")
    private String ydatetime;

    @ApiModelProperty(value = "合同开始")
    private String ystarttimeh;

    @ApiModelProperty(value = "合同结束")
    private String yendtimeh;

    @ApiModelProperty(value = "推荐人")
    private String ytname;

    @ApiModelProperty(value = "整单折扣权")
    private Float yratez;

    @ApiModelProperty(value = "工时折扣权")
    private Float yrateg;

    @ApiModelProperty(value = "商品折扣权")
    private Float yrates;

    @ApiModelProperty(value = "减免权")
    private Float yratej;

    @ApiModelProperty(value = "工作简历")
    private String ygong;

    @ApiModelProperty(value = "教育经历")
    private String yjiao;

    @ApiModelProperty(value = "家庭成员")
    private String yhome;

    @ApiModelProperty(value = "奖惩记录")
    private String yjiang;

    @ApiModelProperty(value = "聘用记录")
    private String yping;

    @ApiModelProperty(value = "岗位编码")
    private Integer gid;

    @ApiModelProperty(value = "部门")
    private Integer bid;

    @ApiModelProperty(value = "照片")
    private String zhaopian;

    @ApiModelProperty(value = "备用字段")
    private String y1;

    @ApiModelProperty(value = "备用字段")
    private String y2;

    @ApiModelProperty(value = "备用字段")
    private String y3;

    @TableField(exist = false)
    private Bumenbiao bu;


    public static final String YID = "yid";

    public static final String YNAME = "yname";

    public static final String YSEX = "ysex";

    public static final String YPOSITION = "yposition";

    public static final String YHEALTH = "yhealth";

    public static final String YLOGINEMP = "yloginemp";

    public static final String YHEIGTH = "yheigth";

    public static final String YNATIVPLACEID = "ynativplaceid";

    public static final String YNATIONID = "ynationid";

    public static final String YSCHOOLID = "yschoolid";

    public static final String YSPECIALTYID = "yspecialtyid";

    public static final String YSPECIALTYNID = "yspecialtynid";

    public static final String YATTRIBUTE = "yattribute";

    public static final String YCOLLEGEID = "ycollegeid";

    public static final String YORGANIZATIONID = "yorganizationid";

    public static final String YNUMBER = "ynumber";

    public static final String YADDRESSH = "yaddressh";

    public static final String YADDRESSX = "yaddressx";

    public static final String YPHONENUMBER = "yphonenumber";

    public static final String YPHONE = "yphone";

    public static final String EMAIL = "email";

    public static final String YBANKID = "ybankid";

    public static final String YBANKPHONE = "ybankphone";

    public static final String YJNAME = "yjname";

    public static final String YJPHONE = "yjphone";

    public static final String YSTARTTIME = "ystarttime";

    public static final String YENDTIME = "yendtime";

    public static final String YDATETIME = "ydatetime";

    public static final String YSTARTTIMEH = "ystarttimeh";

    public static final String YENDTIMEH = "yendtimeh";

    public static final String YTNAME = "ytname";

    public static final String YRATEZ = "yratez";

    public static final String YRATEG = "yrateg";

    public static final String YRATES = "yrates";

    public static final String YRATEJ = "yratej";

    public static final String YGONG = "ygong";

    public static final String YJIAO = "yjiao";

    public static final String YHOME = "yhome";

    public static final String YJIANG = "yjiang";

    public static final String YPING = "yping";

    public static final String GID = "gid";

    public static final String BID = "bid";

    public static final String ZHAOPIAN = "zhaopian";

    public static final String Y1 = "y1";

    public static final String Y2 = "y2";

    public static final String Y3 = "y3";

    @Override
    protected Serializable pkVal() {
        return this.yid;
    }

}
