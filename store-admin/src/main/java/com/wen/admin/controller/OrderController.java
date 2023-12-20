package com.wen.admin.controller;

import com.wen.admin.service.OrderService;
import com.wen.param.PageParam;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: order的controller
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public R list(PageParam pageParam){

        return orderService.list(pageParam);
    }
}
