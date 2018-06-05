package org.microservicecloud.provider.dept.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.microservicecloud.api.entity.Dept;

@Mapper
public interface DeptMapper {

	public boolean insertDept(Dept dept);

	public Dept selectById(Integer id);

	public List<Dept> findAll();

}
