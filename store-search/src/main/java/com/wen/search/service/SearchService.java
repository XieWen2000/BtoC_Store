package com.wen.search.service;

import com.wen.param.ProductSearchParam;
import com.wen.pojo.Product;
import com.wen.utils.R;

import java.io.IOException;

/**
 * projectName: b2c-store
 * <p>
 * description:
 */
public interface SearchService {

    /**
     * 根据关键字和分页进行数据库数据查询
     * @param productSearchParam
     * @return
     */
    R search(ProductSearchParam productSearchParam);

    /**
     * 商品同步 : 插入和更新
     * @param product
     * @return
     */
    R save(Product product) throws IOException;

    /**
     * 进行es库的商品删除
     * @param productId
     * @return
     */
    R remove(Integer productId) throws IOException;
}
