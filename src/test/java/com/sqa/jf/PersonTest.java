package com.sqa.jf;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPersonCreation(){
		// Create Person object and store inside "person" named variable
		Person person = new Person();
		// Display person content by call the toString method on the object
		System.out.println(person);
	}
}
