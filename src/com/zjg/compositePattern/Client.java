/**
 * 
 */
package com.zjg.compositePattern;

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
		
		Component component0 = new Composite();
		Component component1 = new Composite();
		Component component2 = new Composite();
		
		Component leaf0 = new Leaf("1");
		Component leaf1 = new Leaf("2");
		Component leaf2 = new Leaf("3");
		
		component0.add(leaf0);
		component0.add(component1);
		component0.add(leaf1);
		component0.add(component2);
		component0.add(leaf2);
		
		component0.operation();
	}

}
