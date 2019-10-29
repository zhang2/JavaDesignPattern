package com.zjg.mediator.demo;

/**
 * 
 * 
 * @author apple
 * 
 * 买方
 *
 */
public class Seller extends Customer {

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("Seller 收到买房消息");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Seller 发出卖买房信息");
		// 消息中转
		this.edium.relayInfo(this);
	}
	
}
