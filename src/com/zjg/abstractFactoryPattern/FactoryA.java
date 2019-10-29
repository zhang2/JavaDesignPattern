/**
 * 
 */
package com.zjg.abstractFactoryPattern;

/**
 * @author apple
 * 
 * FactoryA 可以组装  普通屏, Inter主板， Dell 机箱
 *
 */
public class FactoryA implements ICreateComputer {

	public FactoryA() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("FactoryA");
	}

	@Override
	public Screen factoryMethodScreen() {
		// TODO Auto-generated method stub
		return new Normal();
	}

	@Override
	public Host factoryMethodHost() {
		// TODO Auto-generated method stub
		return new Dell();
	}

	@Override
	public MainBoard factoryMethodMainBoard() {
		// TODO Auto-generated method stub
		return new Inter();
	}

}
