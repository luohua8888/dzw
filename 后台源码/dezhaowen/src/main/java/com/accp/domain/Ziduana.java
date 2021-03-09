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
 * @since 2021-03-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Ziduana对象", description="")
public class Ziduana extends Model<Ziduana> {

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
        return null;
    }

}
