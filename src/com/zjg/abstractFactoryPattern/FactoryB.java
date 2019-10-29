/**
 * 
 */
package com.zjg.abstractFactoryPattern;

/**
 * @author apple
 * 
 * FactoryB 可以组装  retina屏, AMD主板， Lenovo 机箱
 *
 */
public class FactoryB implements ICreateComputer {

	public FactoryB() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("FactoryB");
	}
	
	@Override
	public Screen factoryMethodScreen() {
		// TODO Auto-generated method stub
		return new Retina();
	}

	@Override
	public Host factoryMethodHost() {
		// TODO Auto-generated method stub
		return new Lenovo();
	}

	@Override
	public MainBoard factoryMethodMainBoard() {
		// TODO Auto-generated method stub
		return new AMD();
	}

}
