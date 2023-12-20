package com.wen.product.config;

import com.wen.config.CacheConfiguration;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 商品模块的配置类
 */
@Configuration
public class ProductConfiguration extends CacheConfiguration {

    /**
     * mq序列化方式，选择json！
     * @return
     */
    @Bean
    public MessageConverter messageConverter(){

        return new Jackson2JsonMessageConverter();
    }
}
