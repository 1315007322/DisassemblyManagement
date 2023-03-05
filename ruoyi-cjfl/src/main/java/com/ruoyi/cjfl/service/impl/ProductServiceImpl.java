package com.ruoyi.cjfl.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cjfl.mapper.ProductMapper;
import com.ruoyi.cjfl.domain.Product;
import com.ruoyi.cjfl.service.IProductService;
import com.ruoyi.common.core.text.Convert;

/**
 * 产品配置管理Service业务层处理
 * 
 * @author superYan
 * @date 2023-03-05
 */
@Service
public class ProductServiceImpl implements IProductService 
{
    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询产品配置管理
     * 
     * @param id 产品配置管理主键
     * @return 产品配置管理
     */
    @Override
    public Product selectProductById(Integer id)
    {
        return productMapper.selectProductById(id);
    }

    /**
     * 查询产品配置管理列表
     * 
     * @param product 产品配置管理
     * @return 产品配置管理
     */
    @Override
    public List<Product> selectProductList(Product product)
    {
        return productMapper.selectProductList(product);
    }

    /**
     * 新增产品配置管理
     * 
     * @param product 产品配置管理
     * @return 结果
     */
    @Override
    public int insertProduct(Product product)
    {
        product.setCreateTime(DateUtils.getNowDate());
        return productMapper.insertProduct(product);
    }

    /**
     * 修改产品配置管理
     * 
     * @param product 产品配置管理
     * @return 结果
     */
    @Override
    public int updateProduct(Product product)
    {
        product.setUpdateTime(DateUtils.getNowDate());
        return productMapper.updateProduct(product);
    }

    /**
     * 批量删除产品配置管理
     * 
     * @param ids 需要删除的产品配置管理主键
     * @return 结果
     */
    @Override
    public int deleteProductByIds(String ids)
    {
        return productMapper.deleteProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品配置管理信息
     * 
     * @param id 产品配置管理主键
     * @return 结果
     */
    @Override
    public int deleteProductById(Integer id)
    {
        return productMapper.deleteProductById(id);
    }
}
