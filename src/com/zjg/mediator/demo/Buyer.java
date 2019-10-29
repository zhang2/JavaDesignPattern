/**
 * 
 */
package com.zjg.mediator.demo;

/**
 * @author apple
 * 
 * 卖方
 *
 */
public class Buyer extends Customer {
	
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("Buyer 收到卖房消息");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Buyer 发出买房请求");
		// 消息中转
		this.edium.relayInfo(this);
	}
	
}
