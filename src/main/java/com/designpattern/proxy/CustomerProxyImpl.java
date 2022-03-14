package com.designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

	CustomerImpl customer = new CustomerImpl();
	
	public int getId() {
		return customer.getId();
	}

	public List<Order> getOrders() {
		List<Order> orders =  new ArrayList<Order>();
		Order order1= new Order();
		order1.setId(1);
		order1.setQuantity(12);
		order1.setProductName("first");
		
		orders.add(order1);
		return orders;
	}

	
}
