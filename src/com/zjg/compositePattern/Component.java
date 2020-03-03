package com.zjg.compositePattern;

/**
 * 
 * @author apple
 * 
 * 抽象组件
 *
 * 实现所有类默认接口
 *
 */
public abstract class Component {
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void operation();
	
	 public abstract Component getChild(int i);
}
