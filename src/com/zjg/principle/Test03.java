package com.zjg.principle;

public class Test03 {
	public static void main(String[] args) {
		
	}

}

//// 接口Ifunc 有一些方法
//interface Ifunc {
//	void func1();
//	void func2();
//	void func3();
//	void func4();
//	void func5();
//}

// 对于a来说 只需实现方法 1，2
//class A implements IfunA {
//
//	@Override
//	public void func1() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("实现func1");
//		
//	}
//
//	@Override
//	public void func2() {
//		// TODO Auto-generated method stub
//		System.out.println("实现func2");
//		
//	}
//
//	@Override
//	public void func3() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void func4() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void func5() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//// 对于b来说 只需实现方法 4，5
//class B implements Ifunc {
//
//	@Override
//	public void func1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void func2() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void func3() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void func4() {
//		// TODO Auto-generated method stub
//		System.out.println("实现func4");
//		
//	}
//
//	@Override
//	public void func5() {
//		// TODO Auto-generated method stub
//		System.out.println("实现func5");
//		
//	}
//	
//}
//
//// 如果不拆分接口，A，B 都要实现不需要的方法，太冗余，所以拆分Ifunc接口
//
//interface IfuncA {
//	void func1();
//	void func2();
//}
//
//interface IfuncB {
//	void func4();
//	void func5();
//}
//
//interface IfunC {
//	void func4();
//	void func5();
//}
//
//
