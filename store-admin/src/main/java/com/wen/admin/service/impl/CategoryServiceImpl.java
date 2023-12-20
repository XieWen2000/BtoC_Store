package com.wen.admin.service.impl;

import com.wen.admin.service.CategoryService;
import com.wen.clients.CategoryClient;
import com.wen.param.PageParam;
import com.wen.pojo.Category;
import com.wen.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 类别业务实现
 */

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryClient categoryClient;

    /**
     * 分页查询方法
     *
     * @param pageParam
     * @return
     */
    @Cacheable(value = "list.category",key = "#pageParam.currentPage+'-'+#pageParam.pageSize")
    @Override
    public R pageList(PageParam pageParam) {

        R r = categoryClient.adminPageList(pageParam);
        log.info("CategoryServiceImpl.pageList业务结束，结果:{}",r);
        return r;
    }

    /**
     * 进行分类数据添加
     *
     * @param category
     * @return
     */
    @CacheEvict(value = "list.category", allEntries = true)
    @Override
    public R save(Category category) {

        R r = categoryClient.adminSave(category);
        log.info("CategoryServiceImpl.save业务结束，结果:{}",r);
        return r;
    }

    /**
     * 根据id删除类别数据
     *
     * @param categoryId
     * @return
     */
    @CacheEvict(value = "list.category", allEntries = true)
    @Override
    public R remove(Integer categoryId) {

        R r = categoryClient.adminRemove(categoryId);

        log.info("CategoryServiceImpl.remove业务结束，结果:{}",r);

        return r;
    }

    /**
     * 修改类别信息
     *
     * @param category
     * @return
     */
    @CacheEvict(value = "list.category", allEntries = true)
    @Override
    public R update(Category category) {

        R r = categoryClient.adminUpdate(category);
        log.info("CategoryServiceImpl.update业务结束，结果:{}",r);
        return r;
    }
}
