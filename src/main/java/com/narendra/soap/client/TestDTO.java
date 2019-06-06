package com.narendra.soap.client;

public class TestDTO {

	private String name;
	
	TestDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestDTO [name=" + name + "]";
	}
	
}
