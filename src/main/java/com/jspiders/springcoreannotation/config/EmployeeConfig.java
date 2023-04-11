package com.jspiders.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotation.bean.*;

public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployee() {
		EmployeeBean emp1=new EmployeeBean();
		emp1.setId(1);
		emp1.setName("Shubham");
		emp1.setEmail("shubham@gmai.com");
		return emp1;
	}
	
	@Bean("emp2")
	public EmployeeBean getEmployeeBean() {
		EmployeeBean emp2=new EmployeeBean(2,"Suraj","suraj@gmail.com");
		return emp2;
	}
}
