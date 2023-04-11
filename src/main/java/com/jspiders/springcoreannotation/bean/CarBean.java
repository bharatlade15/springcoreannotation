package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class CarBean {
		
		@Value("1")
		private int id;
		@Value("Tata")
		private String brand;
		@Value("XUV")
		private String model;
		@Value("MH12BL9999")
		private String regno;
		@Autowired
		private DriverBean driver;
}
