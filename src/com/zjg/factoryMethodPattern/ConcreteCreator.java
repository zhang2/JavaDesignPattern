/**
 * 
 */
package com.zjg.factoryMethodPattern;

/**
 * @author apple
 *
 */
public class ConcreteCreator extends Creator {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProduct();
	}

}
