package com.zjg.observe;

/**
 * 
 * @author apple
 * 
 * 具体被观察者
 *
 */
public class RealSubject extends Subject {

	public void dosomething() {
		super.notifyObserver();
	}

}
