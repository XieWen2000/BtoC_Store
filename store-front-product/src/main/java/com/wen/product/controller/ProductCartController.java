package com.wen.product.controller;

import com.wen.param.ProductCollectParam;
import com.wen.param.ProductIdParam;
import com.wen.pojo.Product;
import com.wen.product.service.ProductService;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 购物车调用商品服务的controller
 */
@RestController
@RequestMapping("product")
public class ProductCartController {

    @Autowired
    private ProductService productService;

    @PostMapping("cart/detail")
    public Product cdetail(@RequestBody  @Validated ProductIdParam productIdParam,
                           BindingResult result){

        if (result.hasErrors()){
            return null;
        }
        R detail = productService.detail(productIdParam.getProductID());
        Product product = (Product) detail.getData();
        return  product;
    }

    @PostMapping("cart/list")
    public List<Product> cartList(@RequestBody @Validated ProductCollectParam productCollectParam,
                                  BindingResult result){

        if (result.hasErrors()){
            return new ArrayList<Product>();
        }

        return productService.cartList(productCollectParam.getProductIds());
    }
}
