/**
 * 
 */
package com.zjg.prototypePattern;

/**
 * @author apple
 * 
 * 简历模板
 *
 */
public abstract class ResumePrototype {
	
	String name;
	
	String school;
	
	String introduction;
	
	public abstract void hobby();
	
	public abstract ResumePrototype clone();
}
