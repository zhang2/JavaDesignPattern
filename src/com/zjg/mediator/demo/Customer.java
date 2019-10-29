/**
 * 
 */
package com.zjg.mediator.demo;

/**
 * @author apple
 * 
 * 客户类
 *
 */
public abstract class Customer {
	String name;
	String phoneNum;
	
	protected Medium edium;	
	//	设置中介者
	public void setMedium(Medium edium) {
	        this.edium=edium;
	} 
	
	// 响应需求
	public abstract void receive();
	 // 提出需求
	public abstract void send();
}
