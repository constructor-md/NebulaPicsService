package com.anastasia.nebulapicsservice.common;

import lombok.Data;

/**
 * 分页请求包装类
 */
@Data
public class PageResult {

    // 当前页号
    private int current = 1;
    // 页面带线啊哦
    private int pageSize = 10;
    // 排序字段
    private String sortField;
    // 排序顺序（默认降序）
    private String sortOrder = "descend";
}
