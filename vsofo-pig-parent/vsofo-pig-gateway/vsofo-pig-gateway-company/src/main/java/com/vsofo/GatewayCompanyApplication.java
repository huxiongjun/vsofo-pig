package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 17:42
 * @description 集团登录网关
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayCompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayCompanyApplication.class, args);
    }
}
