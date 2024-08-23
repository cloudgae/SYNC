
package com.pro.sync.employee.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.pro.sync.employee.vo.EmployeeVo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class EmployeeDaoImpl implements EmployeeDao{

	private final String NS = "com.pro.sync.employee.dao.EmployeeDaoImpl.";
	
	private final SqlSessionTemplate sessionTemplate;
	
	@Override
	public List<EmployeeVo> getAllEmployee() {
		return sessionTemplate.selectList(NS+"getAllEmployee");
	}
  
  	@Override
	public int insertEmployee(EmployeeVo employeeVo) {
		return sessionTemplate.insert(NS + "insertEmployee", employeeVo);
	}

}

