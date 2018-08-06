package com.bailu;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan(basePackages = "com.bailu.ayada")
public class CrtMvnApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CrtMvnApplication.class).run(args);
    }

}