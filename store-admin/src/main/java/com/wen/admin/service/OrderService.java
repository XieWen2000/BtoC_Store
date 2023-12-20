package com.wen.admin.service;

import com.wen.param.PageParam;
import com.wen.utils.R;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
public interface OrderService {

    /**
     * 查询订单数据
     * @param pageParam
     * @return
     */
    R list(PageParam pageParam);
}
