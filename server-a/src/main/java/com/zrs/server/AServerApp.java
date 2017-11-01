package com.zrs.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author zhuruisong on 2017/10/13
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class AServerApp {

    public static void main(String[] args) {
        SpringApplication.run(AServerApp.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/hello")
    public String iFailSometimes(@RequestHeader(value = "aaa",required = false)String aaa, HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        return "hi ,i am from port:" +port+",header aaa ="+aaa;
    }
}
