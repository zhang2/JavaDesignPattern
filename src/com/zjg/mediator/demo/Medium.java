/**
 * 
 */
package com.zjg.mediator.demo;

/**
 * @author apple
 * 
 * 房产中介
 *
 *
 */
public abstract class Medium {
	//  买家或者买家到中介挂名
	abstract void register(Customer customer);
	// 中转消息
	abstract void relayInfo(Customer customer);
}
