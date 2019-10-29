package com.zjg.principle;

public class Test02 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.func2(100, 50));
	}
}

// 我们需要完成一个两数相减的功能，由类A来负责。

class Base {
	public int func1(int a, int b){
		return a-b;
	}
}

class A extends Base{
	
}

// 需要增加一个新的功能：完成两数相加，然后再与100求和，由类B来负责

class B extends Base{
	
	public A a = new A(); // 采用组合的方式
	
	public int func2(int a, int b){
		return this.a.func1(a, b) + 100;
	}
	
}
