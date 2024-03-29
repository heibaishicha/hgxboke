package com.hgx.hgxboke_ui.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="eureka-client")
public interface TestFeign {
	
	@RequestMapping("hello/test")
	public int count();
}
