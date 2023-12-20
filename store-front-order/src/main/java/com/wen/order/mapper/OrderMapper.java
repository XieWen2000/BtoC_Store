package com.wen.order.mapper;

import com.wen.pojo.Order;
import com.wen.vo.AdminOrderVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: order的数据库进行接口
 */
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 查询后台管理的数据方法
     * @param offset
     * @param pageSize
     * @return
     */
    List<AdminOrderVo> selectAdminOrder(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
