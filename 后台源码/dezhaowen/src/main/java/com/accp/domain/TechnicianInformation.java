package com.accp.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author ytang
 * @since 2021-01-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TechnicianInformation对象", description="")
public class TechnicianInformation extends Model<TechnicianInformation> {

    private static final long serialVersionUID=1L;

    @TableField(exist = false)
    private String retechnicianid;
    @TableField(exist = false)
    private TechnicianLevel technicianLevel;
    @TableField(exist = false)
    private MaintenanceTeam maintenanceTeam;
    @ApiModelProperty(value = "技工编号")
    private String technicianid;

    @ApiModelProperty(value = "技工名称")
    private String technicianname;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "是否组长")
    private Integer isteamleader;

    @ApiModelProperty(value = "所在班组")
    private String teamid;

    @ApiModelProperty(value = "手机")
    private String phone;

    @ApiModelProperty(value = "登录手机")
    private String loginphone;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "出生日期")
    private String borndate;

    @ApiModelProperty(value = "微信号")
    private String wechatnumber;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

    @ApiModelProperty(value = "户口地址")
    private String residenceaddress;

    @ApiModelProperty(value = "开户银行")
    private String residencebank;

    @ApiModelProperty(value = "银行账户")
    private String bankaccount;

    @ApiModelProperty(value = "星级")
    private String levelid;

    @ApiModelProperty(value = "维修工种")
    private String maintenancetype;

    @ApiModelProperty(value = "维修品牌")
    private String maintenancebrand;

    @ApiModelProperty(value = "备用字段")
    private String tec1;

    @ApiModelProperty(value = "备用字段")
    private String tec2;

    @ApiModelProperty(value = "备用字段")
    private String tec3;


    public static final String TECHNICIANID = "technicianid";

    public static final String TECHNICIANNAME = "technicianname";

    public static final String SEX = "sex";

    public static final String ISTEAMLEADER = "isteamleader";

    public static final String TEAMID = "teamid";

    public static final String PHONE = "phone";

    public static final String LOGINPHONE = "loginphone";

    public static final String ADDRESS = "address";

    public static final String BORNDATE = "borndate";

    public static final String WECHATNUMBER = "wechatnumber";

    public static final String IDCARD = "idcard";

    public static final String RESIDENCEADDRESS = "residenceaddress";

    public static final String RESIDENCEBANK = "residencebank";

    public static final String BANKACCOUNT = "bankaccount";

    public static final String LEVELID = "levelid";

    public static final String MAINTENANCETYPE = "maintenancetype";

    public static final String MAINTENANCEBRAND = "maintenancebrand";

    public static final String TEC1 = "tec1";

    public static final String TEC2 = "tec2";

    public static final String TEC3 = "tec3";

    @Override
    protected Serializable pkVal() {
        return this.technicianid;
    }

}
