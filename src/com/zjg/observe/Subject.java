package com.zjg.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author apple
 * 
 * 被观察者
 *
 */
public abstract class Subject {
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	void attchObserver(IObserver observer) {
		observers.add(observer);
	}
	void detachObserver(IObserver observer) {
		observers.remove(observer);
	}
	void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}
}
