package com.anastasia.nebulapicsservice.model.dto.picture;

import lombok.Data;

import java.util.List;

@Data
public class PictureTagCategory {

    private List<String> tags;
    private List<String> categoryList;

}
