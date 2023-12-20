package com.wen.admin.service.impl;

import com.wen.admin.service.ProductService;
import com.wen.clients.ProductClient;
import com.wen.clients.SearchClient;
import com.wen.param.ProductSaveParam;
import com.wen.param.ProductSearchParam;
import com.wen.pojo.Product;
import com.wen.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 商品服务实现类
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private SearchClient searchClient;

    /**
     * 全部商品查询和搜索查询的方法
     *
     * @param productSearchParam
     * @return
     */
    @Override
    public R search(ProductSearchParam productSearchParam) {
        R search = searchClient.search(productSearchParam);
        log.info("ProductServiceImpl.search业务结束，结果:{}",search);
        return search;
    }

    /**
     * 进行商品数据保存
     *
     * @param productSaveParam
     * @return
     */
    @Override
    public R save(ProductSaveParam productSaveParam) {

        R r = productClient.adminCount(productSaveParam);
        log.info("ProductServiceImpl.save业务结束，结果:{}",r);
        return r;
    }

    /**
     * 更新商品数据
     *
     * @param product
     * @return
     */
    @Override
    public R update(Product product) {
        R r = productClient.adminUpdate(product);
        log.info("ProductServiceImpl.update业务结束，结果:{}",r);
        return r;
    }

    /**
     * 商品移除功能
     *
     * @param productId
     * @return
     */
    @Override
    public R remove(Integer productId) {

        R r = productClient.adminRemove(productId);
        log.info("ProductServiceImpl.remove业务结束，结果:{}",r);
        return r;
    }
}
