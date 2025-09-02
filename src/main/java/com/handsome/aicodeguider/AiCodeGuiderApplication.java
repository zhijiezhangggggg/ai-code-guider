package com.handsome.aicodeguider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.handsome.aicodeguider.mapper")
public class AiCodeGuiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCodeGuiderApplication.class, args);
    }

}
