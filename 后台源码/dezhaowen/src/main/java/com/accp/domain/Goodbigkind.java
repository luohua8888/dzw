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
@ApiModel(value="Goodbigkind对象", description="")
public class Goodbigkind extends Model<Goodbigkind> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品大类id")
    private Integer goodbigkindid;

    @ApiModelProperty(value = "商品大类类型")
    private String goodbigkindtype;

    @ApiModelProperty(value = "父id")
    private Integer previd;

    @ApiModelProperty(value = "备用字段")
    private String good1;

    @ApiModelProperty(value = "备用字段")
    private String good2;

    @ApiModelProperty(value = "备用字段")
    private String good3;


    public static final String GOODBIGKINDID = "goodbigkindid";

    public static final String GOODBIGKINDTYPE = "goodbigkindtype";

    public static final String PREVID = "previd";

    public static final String GOOD1 = "good1";

    public static final String GOOD2 = "good2";

    public static final String GOOD3 = "good3";

    @Override
    protected Serializable pkVal() {
        return this.goodbigkindid;
    }

}
