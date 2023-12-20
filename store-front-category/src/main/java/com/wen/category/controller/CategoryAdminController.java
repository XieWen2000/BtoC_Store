package com.wen.category.controller;

import com.wen.category.service.CategoryService;
import com.wen.param.PageParam;
import com.wen.pojo.Category;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 后台管理的分类处理controller
 */
@RestController
@RequestMapping("/category")
public class CategoryAdminController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("admin/list")
    public R listPage(@RequestBody PageParam pageParam){

        return categoryService.listPage(pageParam);
    }

    @PostMapping("admin/save")
    public R adminSave(@RequestBody Category category){

        return categoryService.adminSave(category);
    }

    @PostMapping("admin/remove")
    public R adminRemove(@RequestBody Integer categoryId){

        return categoryService.adminRemove(categoryId);
    }

    @PostMapping("admin/update")
    public R adminUpdate(@RequestBody Category category){

        return categoryService.adminUpdate(category);
    }
}
