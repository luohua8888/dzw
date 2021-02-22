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
@ApiModel(value="Chengshibiao对象", description="")
public class Chengshibiao extends Model<Chengshibiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "城市id")
    private Integer qcityid;

    @ApiModelProperty(value = "城市姓名")
    private String qcityname;

    @ApiModelProperty(value = "备用字段")
    private String q1;

    @ApiModelProperty(value = "备用字段")
    private String q2;

    @ApiModelProperty(value = "备用字段")
    private String q3;


    public static final String QCITYID = "qcityid";

    public static final String QCITYNAME = "qcityname";

    public static final String Q1 = "q1";

    public static final String Q2 = "q2";

    public static final String Q3 = "q3";

    @Override
    protected Serializable pkVal() {
        return this.qcityid;
    }

}
