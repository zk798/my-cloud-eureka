package com.zrs.feign.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
class SchedualServiceHiFallbackFactory implements FallbackFactory<SchedualServiceHi> {

        @Override
        public SchedualServiceHi create(Throwable cause) {
            return new SchedualServiceHi() {
                @Override
                public  String sayHiFromClientOne(String name) {
                    return "fallback; reason was: " + cause.getMessage();
                }
            };
        }

}