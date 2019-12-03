/**
 * 
 */
package com.zjg.simpleFactoryPattern;

/**
 * @author apple
 *
 */
public class Factory {
	
	public static Fruit factoryMehtod(String arg) {
		if (arg.equals("apple")) {
			return new Apple();
		} else if (arg.equals("peach")) {
			return new Peach();
		}
		return null;
	}
}
