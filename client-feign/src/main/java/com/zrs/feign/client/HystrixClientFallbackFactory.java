package com.zrs.feign.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
 class HystrixClientFallbackFactory implements FallbackFactory<HystrixClient> {
    @Override
	public HystrixClient create(Throwable cause) {
		return new HystrixClient() {
			@Override
			public String iFailSometimes() {
				return ("fallback; reason was: " + cause.getMessage());
			}
		};
	}
}