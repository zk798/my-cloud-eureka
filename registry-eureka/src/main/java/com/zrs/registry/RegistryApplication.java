package com.zrs.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhuruisong on 2017/10/13
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RegistryApplication.class).web(true).run(args);
    }
}
