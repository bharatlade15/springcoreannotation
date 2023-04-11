package com.jspiders.springcoreannotation.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotation.bean.*;
import com.jspiders.springcoreannotation.config.EmployeeConfig;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
//		EmployeeBean emp1=context.getBean(EmployeeBean.class);
//		System.out.println(emp1);
		
		EmployeeBean emp2=(EmployeeBean) context.getBean("emp2");
		System.out.println(emp2);
		
		((AnnotationConfigApplicationContext)context).close();
	}
	
}
