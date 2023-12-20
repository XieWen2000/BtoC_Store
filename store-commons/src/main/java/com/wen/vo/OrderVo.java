package com.wen.vo;

import com.wen.pojo.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 订单返回的数据实体
 */
//查询订单需要返回结果
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class OrderVo extends Order {

    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("product_picture")
    private String productPicture;

}
