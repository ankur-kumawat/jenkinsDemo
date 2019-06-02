package com.demo.jenkins.models;

public class DemoModel {
	
	private String name;
	private String description;
	
	public DemoModel() {
		this.name = "Demo";
		this.description = "Jenkins Demo";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
