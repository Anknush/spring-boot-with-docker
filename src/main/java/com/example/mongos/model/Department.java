package com.example.mongos.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Department {
	@Field(name="department_name")
	private String department_name;
	@Field(name="department_head")
	private String department_head;
	
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_head() {
		return department_head;
	}
	public void setDepartment_head(String department_head) {
		this.department_head = department_head;
	}
}
