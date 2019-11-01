/**
 * 
 */
package com.zjg.builderPattern;

/**
 * @author apple
 * 
 * 构造者
 *
 */
public abstract class Bulider {
	
	protected Actor actor = new Actor();
	
	public abstract void bulidActorType();
	
	public abstract void bulidActorSex();
	
	public abstract void bulidActorHairStyle();
	
	public abstract Actor actorRole();
}
