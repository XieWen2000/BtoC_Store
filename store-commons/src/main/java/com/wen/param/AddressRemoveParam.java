package com.wen.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 地址移除参数
 */
@Data
public class AddressRemoveParam {

    @NotNull
    private Integer id;
}
