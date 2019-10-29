/**
 * 
 */
package com.zjg.abstractFactoryPattern;

/**
 * @author apple
 * 
 * 组装一台台式机
 *
 */
public interface ICreateComputer {
	// 获取屏幕
	public Screen factoryMethodScreen();
	// 获取主机机箱	
	public Host factoryMethodHost();
	// 获取主板	
	public MainBoard factoryMethodMainBoard();
}
