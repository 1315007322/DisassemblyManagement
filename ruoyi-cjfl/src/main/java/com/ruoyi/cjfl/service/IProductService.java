package com.ruoyi.cjfl.service;

import java.util.List;
import com.ruoyi.cjfl.domain.Product;

/**
 * 产品配置管理Service接口
 * 
 * @author superYan
 * @date 2023-03-05
 */
public interface IProductService 
{
    /**
     * 查询产品配置管理
     * 
     * @param id 产品配置管理主键
     * @return 产品配置管理
     */
    public Product selectProductById(Integer id);

    /**
     * 查询产品配置管理列表
     * 
     * @param product 产品配置管理
     * @return 产品配置管理集合
     */
    public List<Product> selectProductList(Product product);

    /**
     * 新增产品配置管理
     * 
     * @param product 产品配置管理
     * @return 结果
     */
    public int insertProduct(Product product);

    /**
     * 修改产品配置管理
     * 
     * @param product 产品配置管理
     * @return 结果
     */
    public int updateProduct(Product product);

    /**
     * 批量删除产品配置管理
     * 
     * @param ids 需要删除的产品配置管理主键集合
     * @return 结果
     */
    public int deleteProductByIds(String ids);

    /**
     * 删除产品配置管理信息
     * 
     * @param id 产品配置管理主键
     * @return 结果
     */
    public int deleteProductById(Integer id);
}
