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
 * @author ytang
 * @since 2021-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Ziduan对象", description="")
public class Ziduan extends Model<Ziduan> {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String width;

    private String dname;

    private String zname;

    private Integer display;


    public static final String ID = "id";

    public static final String WIDTH = "width";

    public static final String DNAME = "dname";

    public static final String ZNAME = "zname";

    public static final String DISPLAY = "display";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
