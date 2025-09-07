package com.bruce.bruceaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)     // 开启AOP 通过AOP对当前代理对象的访问，使得在业务中访问到当前的代理对象
@MapperScan("com.bruce.bruceaicode.mapper")
public class BruceAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BruceAiCodeApplication.class, args);
    }

}
