package com.pro.sync.login.service;

import java.util.Map;

import com.pro.sync.employee.vo.EmployeeVo;

public interface ILoginService {

	public EmployeeVo getLogin(Map<String, Object> map);
}
