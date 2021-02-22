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
@ApiModel(value="Bumenbiao对象", description="")
public class Bumenbiao extends Model<Bumenbiao> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "部门编号")
    private Integer bid;

    @ApiModelProperty(value = "部门名称")
    private String bname;

    @ApiModelProperty(value = "部门分类")
    private Integer blei;

    @ApiModelProperty(value = "备用字段")
    private String b1;

    @ApiModelProperty(value = "备用字段")
    private String b2;

    @ApiModelProperty(value = "备用字段")
    private String b3;


    public static final String BID = "bid";

    public static final String BNAME = "bname";

    public static final String BLEI = "blei";

    public static final String B1 = "b1";

    public static final String B2 = "b2";

    public static final String B3 = "b3";

    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}
