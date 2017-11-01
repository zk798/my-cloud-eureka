package com.zrs.feign.controller;

import com.zrs.feign.client.HystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuruisong on 2017/10/16
 * @since 1.0
 */
@RestController
public class HystrixController {

    @Autowired
    HystrixClient hystrixClient;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String iFailSometimes(){
       return hystrixClient.iFailSometimes();
    }
}
