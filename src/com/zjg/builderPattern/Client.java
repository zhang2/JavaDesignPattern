/**
 * 
 */
package com.zjg.builderPattern;

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
		Director director = new Director(new ActionBulider());
		Actor actor = director.construct();
		System.out.println(actor);
	}

}

/**
 * 
 * 将一个复杂对象的构造与他的表示分离
 * 
 * 使得同样的的构造郭传给你可以创建不同的表示
 * 
 * 
 * 
 * 
 * */
