package com.wen.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 类别热门商品参数接收
 */
@Data
public class ProductPromoParam {

    @NotBlank
    private String categoryName;
}
