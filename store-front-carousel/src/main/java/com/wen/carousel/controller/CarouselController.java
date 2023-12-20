package com.wen.carousel.controller;

import com.wen.carousel.service.CarouselService;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 轮播图的控制类
 */
@RestController
@RequestMapping("carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    /**
     * 查询轮播图数据,只要优先级最高的6条!
     * @return
     */
    @PostMapping("list")
    public R list(){

        return carouselService.list();
    }

}
