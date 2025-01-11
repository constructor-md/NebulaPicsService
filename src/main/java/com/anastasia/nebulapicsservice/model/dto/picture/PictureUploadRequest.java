package com.anastasia.nebulapicsservice.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    // 图片id 用于修改 支持基本信息不变只修改图片文件等
    private Long id;

    private static final long serialVersionUID = 1L;

}
