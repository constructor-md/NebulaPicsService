package com.anastasia.nebulapicsservice.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    // 图片id 用于修改 支持基本信息不变只修改图片文件等
    private Long id;

    // 文件地址 Url上传方式使用
    private String fileUrl;

    // 图片名称 可选的指定名称 主要是批量拉取图片时会指定
    private String picName;

    private static final long serialVersionUID = 1L;

}
