package com.wen.admin.controller;

import com.wen.admin.service.CategoryService;
import com.wen.param.PageParam;
import com.wen.pojo.Category;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 类别controller
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public R pageList(PageParam pageParam){

        return categoryService.pageList(pageParam);
    }

    @PostMapping("save")
    public R save(Category category){

        return categoryService.save(category);
    }

    @PostMapping("remove")
    public R remove(Integer categoryId){

        return categoryService.remove(categoryId);
    }

    @PostMapping("update")
    public R update(Category category){

        return categoryService.update(category);
    }
}
