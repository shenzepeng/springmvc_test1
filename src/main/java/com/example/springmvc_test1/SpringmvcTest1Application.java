package com.example.springmvc_test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringmvcTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcTest1Application.class, args);
    }

}
