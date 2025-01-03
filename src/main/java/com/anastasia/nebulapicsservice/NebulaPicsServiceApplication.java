package com.anastasia.nebulapicsservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
// mybatis包扫描
@MapperScan("com.anastasia.nebulapicsservice.mapper")
// exposeProxy = true 可以在业务逻辑中通过AopContext.currentProxy()获取当前代理对象
@EnableAspectJAutoProxy(exposeProxy = true)
public class NebulaPicsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NebulaPicsServiceApplication.class, args);
    }

}
