package com.yyskt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.yyskt.mapper")
public class YysktApplication {

    public static void main(String[] args) {
        SpringApplication.run(YysktApplication.class, args);
    }
    
}
