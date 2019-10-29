package com.zjg.proxy;

/**
 * 
 * @author apple
 * 
 * 测试类
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICase icase = new Lawyer(new Person());
		icase.casehandle();
		
	}

}
