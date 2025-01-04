package com.anastasia.nebulapicsservice.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求包装类
 */
@Data
public class DeleteRequest implements Serializable {

    // 要删除的数据id
    private long id;
    private static final long serailVersionUID = 1L;

}
