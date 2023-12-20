package com.wen.cart;

import com.wen.clients.ProductClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wen.cart.mapper")
@EnableFeignClients(clients = {ProductClient.class})
public class CartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class,args);
    }
}
