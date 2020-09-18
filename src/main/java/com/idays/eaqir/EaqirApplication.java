package com.idays.eaqir;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(basePackages = "com.idays.eaqir.mapper")
public class EaqirApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaqirApplication.class, args);
    }

}
