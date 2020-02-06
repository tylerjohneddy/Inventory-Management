package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.PatternLayout;
import org.junit.Test;

import com.qa.project.five.week.tables.Order;

public class OrderTest {
	private static final Order order = new Order(3, 9.99, 1, 10);

	@Test
	public void orderSetterGetterTest() {

		order.setId(1);
		order.setCost(6.39);
		order.setCustomerId(4);
		order.setDiscount(90);
		assertEquals(1,order.getId());
		assertEquals(6.39,order.getCost(),0.001);
		assertEquals(4, order.getCustomerId());
		assertEquals(90, order.getDiscount());

	}

}
