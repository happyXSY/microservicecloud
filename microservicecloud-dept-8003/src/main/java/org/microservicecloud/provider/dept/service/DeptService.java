package org.microservicecloud.provider.dept.service;

import java.util.List;

import org.microservicecloud.api.entity.Dept;

public interface DeptService {
	public boolean insertDept(Dept dept);

	public Dept selectById(Integer id);

	public List<Dept> findAll();
}
