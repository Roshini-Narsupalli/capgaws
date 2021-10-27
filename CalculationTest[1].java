package com.capg.corejava.junit5;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculationTest  {
	
	Calculation cal=new Calculation();
	
	//Ram
	@Test
	public void testCalculation()
	{		
		try {			
			assertEquals(20,cal.addition(5, 15));
			assertEquals(10,cal.subtraction(30, 20));	
			assertEquals(4,cal.multiplication(2, 2));
			
		}
		catch(Exception e)
		{System.out.println(e);
		
	} 	
	}

}
