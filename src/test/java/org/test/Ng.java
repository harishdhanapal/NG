package org.test;

import java.sql.Driver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Ng {

	
	@Parameters({"user","name"})
	@Test
	private void who(String s,String s1) {
		System.out.println("life"+s+s1);

		
	}
	
	@Test
	private void lession() {
		// TODO Auto-generated method stub
System.out.println("bible");

	}
	
	@Test
	private void genesis() {
		// TODO Auto-generated method stub
System.out.println("first book");
	}
	
	@Test
	private void genesiss() {
		// TODO Auto-generated method stub
System.out.println("first book");
	}
	
	@Test
	private void genesisss() {
		// TODO Auto-generated method stub
System.out.println("first book");
	}
	@Test
	private void genesisssss() {
		// TODO Auto-generated method stub
System.out.println("first book");
	}
}
