package com.anastasia.nebulapicsservice.model.dto.picture;

import lombok.Data;

@Data
public class PictureUploadByBatchRequest {

    // 搜索词
    private String searchText;
    // 抓取数量
    private Integer count = 10;
    // 名称前缀 便于拉取者知道是哪一批拉取
    private String namePrefix;
}
