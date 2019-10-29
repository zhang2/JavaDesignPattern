package com.zjg.mediator.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medium medium = new EstateMedium();
		Customer buyer = new Buyer();
		Customer seller = new Seller();
		
		medium.register(seller);
		medium.register(buyer);
		
		buyer.send();
	    System.out.println("-------------");
	    seller.send();
	}
	
}
