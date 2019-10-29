/**
 * 
 */
package com.zjg.simpleFactoryPattern;

/**
 * @author apple
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		
		factory.factoryMehtod("apple");
		
		factory.factoryMehtod("peach");
	}

}
