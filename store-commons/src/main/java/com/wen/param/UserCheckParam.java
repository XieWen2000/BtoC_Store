package com.wen.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 接收前端参数的param
 * @NotBlank 字符串 不能为null 和 空字符串 ""
 * @NotNull  字符串 不能为null
 * @NotEmpty 集合类型 集合长度不能为0
 */
@Data
public class UserCheckParam {

    @NotBlank
    private String userName;
}
