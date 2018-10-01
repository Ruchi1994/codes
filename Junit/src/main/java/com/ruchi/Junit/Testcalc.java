package com.ruchi.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

@SuppressWarnings("unused")
public class Testcalc {
	
	Caladd ca=new Caladd();
	
	@Test
    public void testadd()
    {
    	assertEquals(5, ca.add(2,4));
    	
    }
}
