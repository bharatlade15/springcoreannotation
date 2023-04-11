package com.jspiders.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DriverBean {

	@Value("1")
	private int id;
	@Value("Mukesh")
	private String name;
	@Value("8989898990")
	private long contact;
}
