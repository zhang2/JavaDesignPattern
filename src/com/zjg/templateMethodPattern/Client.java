/**
 * 
 */
package com.zjg.templateMethodPattern;

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
		
		Template template = new ConCreateTemplate();
		template.TemplateMethod();
	}

}
