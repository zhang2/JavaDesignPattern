package com.zjg.observe;

/**
 * 
 * @author apple
 * 
 * 测试（场景）类
 *
 */

public class Client {

	public static void main(String[] args) {
	
		RealSubject realsubject = new RealSubject();
		
		realsubject.attchObserver(new RealObserver());
		
		realsubject.dosomething();
	}
}
