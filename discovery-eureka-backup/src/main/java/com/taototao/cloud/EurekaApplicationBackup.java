package com.taototao.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-23 15:02
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationBackup {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplicationBackup.class,args);
    }

}
