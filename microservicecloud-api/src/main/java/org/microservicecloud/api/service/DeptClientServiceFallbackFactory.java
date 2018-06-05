package org.microservicecloud.api.service;

import org.microservicecloud.api.entity.Dept;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
			@Override
			public Dept get(Integer id) {
				return new Dept().setId(id).setName("没有对象的数据,服务降级了").setDbsource("no database!");
			}
		};
	}
}
