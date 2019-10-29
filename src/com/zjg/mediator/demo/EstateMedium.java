package com.zjg.mediator.demo;

import java.util.ArrayList;
import java.util.List;

public class EstateMedium extends Medium {
	
	private List<Customer> customers=new ArrayList<Customer>();   

	@Override
	void register(Customer customer) {
		// TODO Auto-generated method stub
		if (!this.customers.contains(customer)) {
			this.customers.add(customer);
			// 设置中介者
			customer.setMedium(this);
		}
	}

	@Override
	void relayInfo(Customer customer) {
		// TODO Auto-generated method stub
		for (Customer cus : customers) {
			if (!cus.equals(customer)) {
				((Customer)cus).receive();
			}
		}
	}
}
