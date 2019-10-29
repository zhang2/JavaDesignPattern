package com.zjg.mediator;

public class Client {
	
	public static void main(String[] args) {
		// 中介对象来封装对象的交互
		
		 Mediator md=new ConcreteMediator();
	        Colleague c1,c2;
	        c1=new ColleagueA();
	        c2=new ColleagueB();
	        md.register(c1);
	        md.register(c2);
	        c1.send();
	        System.out.println("-------------");
	        c2.send();
	}

}
