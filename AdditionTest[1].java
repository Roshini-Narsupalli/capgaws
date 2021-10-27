package com.capg.corejava.junit5;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	int t1,t2;
	
	
    public void setUp() {
    	t1=15;
    	t2=5;
    }
    public void testAdd() {
    	int result =t1+t2;
    	
    	assertTrue(result==20);
    }
}
