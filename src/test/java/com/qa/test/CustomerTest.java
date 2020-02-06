package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.tables.Customer;

public class CustomerTest {
	private static final Customer customer = new Customer(6, "old", "older");
	@Test
	public void customerSetterGetterTest() {
		customer.setFirstName("Tyler");
		customer.setSurname("Eddy");
		customer.setId(1);
		assertEquals("Tyler", customer.getFirstName());
		assertEquals("Eddy", customer.getSurname());
		assertEquals(1, customer.getId());
	}
	


}
