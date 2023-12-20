package com.wen.admin.service;

import com.wen.param.PageParam;
import com.wen.pojo.Category;
import com.wen.utils.R;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
public interface CategoryService {

    /**
     * 分页查询方法
     * @param pageParam
     * @return
     */
    R pageList(PageParam pageParam);

    /**
     * 进行分类数据添加
     * @param category
     * @return
     */
    R save(Category category);

    /**
     * 根据id删除类别数据
     * @param categoryId
     * @return
     */
    R remove(Integer categoryId);

    /**
     * 修改类别信息
     * @param category
     * @return
     */
    R update(Category category);
}
