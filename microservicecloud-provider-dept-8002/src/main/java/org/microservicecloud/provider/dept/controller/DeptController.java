package org.microservicecloud.provider.dept.controller;

import org.microservicecloud.api.entity.Dept;
import org.microservicecloud.provider.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("dept")
public class DeptController {
	@Autowired
	private DeptService deptServie;
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix")
	public Dept get(@PathVariable("id") Integer id) {
		Dept dept = deptServie.selectById(id);
		if (dept == null) {
			throw new RuntimeException("没有" + id + "该条数据！");
		}
		return dept;
	}

	public Dept processHystrix(@PathVariable("id") Integer id) {
		return new Dept().setName("B_server 该" + id + "没有对应的数据,null---@HystrixCommand").setDbsource("no database！")
				.setId(id);
	}
}
