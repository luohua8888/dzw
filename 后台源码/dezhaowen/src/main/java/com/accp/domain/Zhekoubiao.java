package com.accp.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @author y
 * @since 2021-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Zhekoubiao对象", description="")
public class Zhekoubiao extends Model<Zhekoubiao> {

    private static final long serialVersionUID=1L;

    @TableId(value = "zid", type = IdType.AUTO)
    private Integer zid;

    private String zname;

    private Float zhe;

    private String z1;

    private String z2;

    private String z3;


    public static final String ZID = "zid";

    public static final String ZNAME = "zname";

    public static final String ZHE = "zhe";

    public static final String Z1 = "z1";

    public static final String Z2 = "z2";

    public static final String Z3 = "z3";

    @Override
    protected Serializable pkVal() {
        return this.zid;
    }

}
