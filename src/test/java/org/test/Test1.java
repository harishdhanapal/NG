package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	private void ip() {
		// TODO Auto-generated method stub
System.out.println("pogo");
	}
	
	@Test (invocationCount=3)
	private void man() {
		// TODO Auto-generated method stub
System.out.println("cartoon");
Assert.assertTrue(false);
	}
	
	
}
