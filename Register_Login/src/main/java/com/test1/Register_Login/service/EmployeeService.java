package com.test1.Register_Login.service;

import com.test1.Register_Login.Dto.EmployeeDTO;
import com.test1.Register_Login.Dto.LoginDTO;
import com.test1.Register_Login.response.LoginResponse;

public interface EmployeeService {
	
	
	String addEmployee (EmployeeDTO employeeDTO);
	
	LoginResponse loginEmployee (LoginDTO loginDTO);
	
	
	

}
