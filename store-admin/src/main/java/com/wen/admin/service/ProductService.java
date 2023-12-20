package com.wen.admin.service;

import com.wen.param.ProductSaveParam;
import com.wen.param.ProductSearchParam;
import com.wen.pojo.Product;
import com.wen.utils.R;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
public interface ProductService {

    /**
     * 全部商品查询和搜索查询的方法
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 进行商品数据保存
     * @param productSaveParam
     * @return
     */
    R save(ProductSaveParam productSaveParam);

    /**
     * 更新商品数据
     * @param product
     * @return
     */
    R update(Product product);

    /**
     * 商品移除功能
     * @param productId
     * @return
     */
    R remove(Integer productId);
}
