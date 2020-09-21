package com.zjg.mvp;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Presenter presenter = new Presenter(new View());
		presenter.requestData();
		presenter.doSomething();
		
	}
}

/*
 * Presenter完全把Model和View进行了分离，主要的程序逻辑在Presenter里实现
 * 
 * Presenter与具体的View是没有直接关联的，而是通过定义好的接口进行交互，从而使得在变更View时候可以保持Presenter的不变，即重用
 * 
 * 模型与视图完全分离，我们可以修改视图而不影响模型
 * 
 * 
 * */
