package com.wen.to;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 订单发送商品服务的实体
 */

@Data
public class OrderToProduct implements Serializable {

    public static final Long serialVersionUID = 1L;


    private Integer productId;
    private Integer num;

}
