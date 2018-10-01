package com.ruchi.Demohib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hiber {
	@Id 
	public int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
