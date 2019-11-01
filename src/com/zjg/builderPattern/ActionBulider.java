/**
 * 
 */
package com.zjg.builderPattern;

/**
 * @author apple
 *
 */
public class ActionBulider extends Bulider {

	@Override
	public void bulidActorType() {
		// TODO Auto-generated method stub
		this.actor.setType("法师");
	}

	@Override
	public void bulidActorSex() {
		// TODO Auto-generated method stub
		this.actor.setSex("男");
	}

	@Override
	public void bulidActorHairStyle() {
		// TODO Auto-generated method stub
		this.actor.setHairStyle("齐刘海");
	}

	@Override
	public Actor actorRole() {
		// TODO Auto-generated method stub
		return this.actor;
	}

}
