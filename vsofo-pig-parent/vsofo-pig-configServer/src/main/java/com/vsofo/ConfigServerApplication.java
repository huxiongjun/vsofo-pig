package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/14 16:18
 * @description 配置中心服务类
 */
@SpringBootApplication

public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
