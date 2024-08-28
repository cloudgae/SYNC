package com.pro.sync.employee.service;

import java.util.List;

import com.pro.sync.employee.vo.EmployeeVo;

public interface EmployeeService {

	public List<EmployeeVo> getAllEmployee();
	
	public int insertEmployee(EmployeeVo employeeVo);
	
	public EmployeeVo employeeSelectDetail(String emp_id);
	
	public int updateEmployee(EmployeeVo employeeVo);
	
	public int deleteEmployee(String emp_id);
	
}
