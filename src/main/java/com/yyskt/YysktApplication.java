package com.yyskt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyskt.mapper")
public class YysktApplication {

    public static void main(String[] args) {
        SpringApplication.run(YysktApplication.class, args);
    }
    
}
