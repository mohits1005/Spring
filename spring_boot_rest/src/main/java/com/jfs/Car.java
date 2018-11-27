package com.jfs;

import org.springframework.lang.NonNull;

public class Car {
    public Car() {
		super();
	}
    public Car(String name) {
    	this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Long id;
    private @NonNull String name;
    
}
