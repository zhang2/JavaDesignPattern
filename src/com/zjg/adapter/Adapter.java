package com.zjg.adapter;

/**
 * 
 * @author apple
 * 
 * 适配器
 *
 */
public class Adapter extends Adaptee implements ITarget {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		specificRequest();  
	}
	
}
