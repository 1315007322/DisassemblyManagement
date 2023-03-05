package ruoyi.cjfl.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import ruoyi.common.annotation.Excel;
import ruoyi.common.core.domain.BaseEntity;

/**
 * 基础原材料配置管理对象 material
 * 
 * @author superYan
 * @date 2023-03-05
 */
public class Material extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Integer id;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String name;

    /** 当日单价/kg */
    @Excel(name = "当日单价/kg")
    private BigDecimal price;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("price", getPrice())
            .toString();
    }
}
