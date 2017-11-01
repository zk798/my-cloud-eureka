package com.zrs.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api-a", fallbackFactory = HystrixClientFallbackFactory.class)
public interface HystrixClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String iFailSometimes();
}