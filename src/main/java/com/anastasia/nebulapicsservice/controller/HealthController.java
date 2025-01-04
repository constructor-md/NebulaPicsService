package com.anastasia.nebulapicsservice.controller;

import com.anastasia.nebulapicsservice.common.BaseResponse;
import com.anastasia.nebulapicsservice.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
