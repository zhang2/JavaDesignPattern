/**
 * 
 */
package com.zjg.builderPattern;

/**
 * @author apple
 *
 */
public class Director {

	private Bulider bulider;
	
	
	/**
	 * @return the bulider
	 */
	public Bulider getBulider() {
		return bulider;
	}

	/**
	 * @param bulider the bulider to set
	 */
	public void setBulider(Bulider bulider) {
		this.bulider = bulider;
	}
	

	/**
	 * @param bulider
	 */
	public Director(Bulider bulider) {
		super();
		this.bulider = bulider;
	}

	public Actor construct() {
		
		this.bulider.bulidActorType();
		this.bulider.bulidActorSex();
		this.bulider.bulidActorHairStyle();
		
		return this.bulider.actorRole();
	}
	
}
