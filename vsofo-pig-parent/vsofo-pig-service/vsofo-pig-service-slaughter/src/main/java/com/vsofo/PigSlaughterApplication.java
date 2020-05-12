package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 17:52
 * @description 出栏微服务启动类
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.vsofo.inventory.feign"})
public class PigSlaughterApplication {
    public static void main(String[] args) {
        SpringApplication.run(PigSlaughterApplication.class, args);
    }
}
