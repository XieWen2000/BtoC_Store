package com.wen.param;

import lombok.Data;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 搜索关键字和分页参数集合
 */
@Data
public class ProductSearchParam extends PageParam{

    private String search;

}
