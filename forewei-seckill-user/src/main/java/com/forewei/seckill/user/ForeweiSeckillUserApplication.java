package com.forewei.seckill.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.forewei.seckill.user.mapper")
@EnableSwagger2
@EnableFeignClients
public class ForeweiSeckillUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForeweiSeckillUserApplication.class, args);
    }

}
