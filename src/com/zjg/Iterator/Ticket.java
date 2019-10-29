/**
 * 
 */
package com.zjg.Iterator;

/**
 * @author apple
 * 
 * 票
 *
 */
public class Ticket {
	// 火车班次
	String trainNo;
	
	String name;

	public Ticket(String trainNo, String name) {
		super();
		this.trainNo = trainNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ticket [trainNo=" + trainNo + ", name=" + name + "]";
	}
}
