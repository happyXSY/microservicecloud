package org.microservicecloud.consumer.dept.controller;

import org.microservicecloud.api.entity.Dept;
import org.microservicecloud.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController_Consumer {
	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	// private static final String REST_URL_PREFIX =
	// "http://MICROSERVICECLOUD-DEPT/";
	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "consumer/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Integer id) {
		return deptClientService.get(id);
	}
}
