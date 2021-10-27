package com.capg.corejava.junit5;

import static org.junit.Assert.assertArrayEquals;



import org.junit.Test;
public class ArrayEqualsTest {
	
	@Test
	public void myTestAMethod() {
		String[] expectedOutput = { "apple","mango","grape"};
		
		String[] methodOutput = {"apple  ","mango","grape"};
		
		assertArrayEquals(expectedOutput, methodOutput);
	}
    
	

}
