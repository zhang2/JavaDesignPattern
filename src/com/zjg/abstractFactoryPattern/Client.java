/**
 * 
 */
package com.zjg.abstractFactoryPattern;

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
		//		组装一台电脑，需要  显示屏 主板	主机
		//		1.FactoryA 可以组装  普通屏, Inter主板， Dell 机箱
		ICreateComputer computer = new FactoryA();
		computer.factoryMethodHost();
		computer.factoryMethodMainBoard();
		computer.factoryMethodScreen();
		
		System.out.println("------------------------");
		
		//		2.FactoryB 可以组装  retina屏, AMD主板， Lenovo 机箱		
		computer = new FactoryB();
		computer.factoryMethodHost();
		computer.factoryMethodMainBoard();
		computer.factoryMethodScreen();
	}

}


/*
 * 定义一个接口，创建相关或者有依赖关系的对象簇，无需指明具体类
 * 
 * 是对工厂模式的进一步抽象，把工厂类抽象成工厂类族
 * 
 * 
 * 组装一台  需要
 * 
 * 显示屏   	(有 普通屏 normal， 视网膜屏 Retina) 
 * 
 * 主板		(Inter, AMD)
 * 
 * 主机     (Lenovo, Dell)
 * 
 * 
 * */

