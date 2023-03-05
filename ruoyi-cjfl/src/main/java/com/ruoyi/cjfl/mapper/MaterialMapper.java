package com.ruoyi.cjfl.mapper;

import java.util.List;
import com.ruoyi.cjfl.domain.Material;

/**
 * 基础原材料配置管理Mapper接口
 * 
 * @author superYan
 * @date 2023-03-05
 */
public interface MaterialMapper 
{
    /**
     * 查询基础原材料配置管理
     * 
     * @param id 基础原材料配置管理主键
     * @return 基础原材料配置管理
     */
    public Material selectMaterialById(Integer id);

    /**
     * 查询基础原材料配置管理列表
     * 
     * @param material 基础原材料配置管理
     * @return 基础原材料配置管理集合
     */
    public List<Material> selectMaterialList(Material material);

    /**
     * 新增基础原材料配置管理
     * 
     * @param material 基础原材料配置管理
     * @return 结果
     */
    public int insertMaterial(Material material);

    /**
     * 修改基础原材料配置管理
     * 
     * @param material 基础原材料配置管理
     * @return 结果
     */
    public int updateMaterial(Material material);

    /**
     * 删除基础原材料配置管理
     * 
     * @param id 基础原材料配置管理主键
     * @return 结果
     */
    public int deleteMaterialById(Integer id);

    /**
     * 批量删除基础原材料配置管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMaterialByIds(String[] ids);
}
