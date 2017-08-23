package com.taototao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-23 11:27
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieFeignHystrixApplication.class, args);
    }

}
