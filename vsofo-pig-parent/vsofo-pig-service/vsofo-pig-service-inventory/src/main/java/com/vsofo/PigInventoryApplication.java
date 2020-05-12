package com.vsofo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 17:51
 * @description 猪存栏微服务
 */
@SpringBootApplication/*(exclude = DataSourceAutoConfiguration.class)*/
@EnableEurekaClient
@MapperScan("com.vsofo.inventory.mapper")
public class PigInventoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(PigInventoryApplication.class, args);
    }
}