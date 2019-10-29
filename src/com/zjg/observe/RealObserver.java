package com.zjg.observe;

/**
 * 
 * @author apple
 * 
 * 具体观察者
 *
 */
public class RealObserver implements IObserver {
	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("接受到信息，更新通知");
	}

}
