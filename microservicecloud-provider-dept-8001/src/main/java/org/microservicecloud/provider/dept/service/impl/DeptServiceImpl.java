package org.microservicecloud.provider.dept.service.impl;

import java.util.List;

import org.microservicecloud.api.entity.Dept;
import org.microservicecloud.provider.dept.mapper.DeptMapper;
import org.microservicecloud.provider.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptmapper;

	@Override
	public boolean insertDept(Dept dept) {
		return deptmapper.insertDept(dept);
	}

	@Override
	public Dept selectById(Integer id) {
		return deptmapper.selectById(id);
	}

	@Override
	public List<Dept> findAll() {
		return deptmapper.findAll();
	}

}
