package com.wen.order.controller;

import com.wen.order.service.OrderService;
import com.wen.param.CartListParam;
import com.wen.param.OrderParam;
import com.wen.param.PageParam;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 订单的controller
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("save")
    public R save(@RequestBody OrderParam orderParam){
        return orderService.save(orderParam);
    }


    @PostMapping("list")
    public R list(@RequestBody @Validated CartListParam CartListParam, BindingResult result){

        if (result.hasErrors()){
            return R.fail("参数异常,查询失败!");
        }

        return orderService.list(CartListParam.getUserId());
    }


    @PostMapping("remove/check")
    public R check(@RequestBody Integer productId)
    {
        return orderService.check(productId);
    }


    @PostMapping("admin/list")
    public R adminList(@RequestBody PageParam pageParam)
    {
        return orderService.adminList(pageParam);
    }

}
