package com.zjg.factoryMethodPattern;

/**
 * 
 * @author apple
 * 
 * 测试类
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator creator = new ConcreteCreator();
		creator.factoryMethod();
	}

}
