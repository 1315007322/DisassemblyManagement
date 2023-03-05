package com.ruoyi.cjfl.service.impl;

import java.util.List;

import com.ruoyi.cjfl.mapper.MaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cjfl.domain.Material;
import com.ruoyi.cjfl.service.IMaterialService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础原材料配置管理Service业务层处理
 * 
 * @author superYan
 * @date 2023-03-05
 */
@Service
public class MaterialServiceImpl implements IMaterialService 
{
    @Autowired
    private MaterialMapper materialMapper;

    /**
     * 查询基础原材料配置管理
     * 
     * @param id 基础原材料配置管理主键
     * @return 基础原材料配置管理
     */
    @Override
    public Material selectMaterialById(Integer id)
    {
        return materialMapper.selectMaterialById(id);
    }

    /**
     * 查询基础原材料配置管理列表
     * 
     * @param material 基础原材料配置管理
     * @return 基础原材料配置管理
     */
    @Override
    public List<Material> selectMaterialList(Material material)
    {
        return materialMapper.selectMaterialList(material);
    }

    /**
     * 新增基础原材料配置管理
     * 
     * @param material 基础原材料配置管理
     * @return 结果
     */
    @Override
    public int insertMaterial(Material material)
    {
        return materialMapper.insertMaterial(material);
    }

    /**
     * 修改基础原材料配置管理
     * 
     * @param material 基础原材料配置管理
     * @return 结果
     */
    @Override
    public int updateMaterial(Material material)
    {
        return materialMapper.updateMaterial(material);
    }

    /**
     * 批量删除基础原材料配置管理
     * 
     * @param ids 需要删除的基础原材料配置管理主键
     * @return 结果
     */
    @Override
    public int deleteMaterialByIds(String ids)
    {
        return materialMapper.deleteMaterialByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础原材料配置管理信息
     * 
     * @param id 基础原材料配置管理主键
     * @return 结果
     */
    @Override
    public int deleteMaterialById(Integer id)
    {
        return materialMapper.deleteMaterialById(id);
    }
}
