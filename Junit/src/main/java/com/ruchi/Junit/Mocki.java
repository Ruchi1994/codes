package com.ruchi.Junit;

public class Mocki {

	Calser service;
	public Mocki(Calser service)
	{
		this.service = service;
	}
	public int perform(int i, int j) {
		
		return service.add(i, j)*i;
	}
	
}
