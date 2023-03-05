package com.ruoyi.cjfl.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.cjfl.domain.Material;
import com.ruoyi.cjfl.service.IMaterialService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础原材料配置管理Controller
 * 
 * @author superYan
 * @date 2023-03-05
 */
@Controller
@RequestMapping("/cjfl/material")
public class MaterialController extends BaseController
{
    private String prefix = "cjfl/material";

    @Autowired
    private IMaterialService materialService;

    @RequiresPermissions("cjfl:material:view")
    @GetMapping()
    public String material()
    {
        return prefix + "/material";
    }

    /**
     * 查询基础原材料配置管理列表
     */
    @RequiresPermissions("cjfl:material:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Material material)
    {
        startPage();
        List<Material> list = materialService.selectMaterialList(material);
        return getDataTable(list);
    }

    /**
     * 导出基础原材料配置管理列表
     */
    @RequiresPermissions("cjfl:material:export")
    @Log(title = "基础原材料配置管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Material material)
    {
        List<Material> list = materialService.selectMaterialList(material);
        ExcelUtil<Material> util = new ExcelUtil<Material>(Material.class);
        return util.exportExcel(list, "基础原材料配置管理数据");
    }

    /**
     * 新增基础原材料配置管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础原材料配置管理
     */
    @RequiresPermissions("cjfl:material:add")
    @Log(title = "基础原材料配置管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Material material)
    {
        return toAjax(materialService.insertMaterial(material));
    }

    /**
     * 修改基础原材料配置管理
     */
    @RequiresPermissions("cjfl:material:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Material material = materialService.selectMaterialById(id);
        mmap.put("material", material);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础原材料配置管理
     */
    @RequiresPermissions("cjfl:material:edit")
    @Log(title = "基础原材料配置管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Material material)
    {
        return toAjax(materialService.updateMaterial(material));
    }

    /**
     * 删除基础原材料配置管理
     */
    @RequiresPermissions("cjfl:material:remove")
    @Log(title = "基础原材料配置管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(materialService.deleteMaterialByIds(ids));
    }
}
