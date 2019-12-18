package com.zjg.states;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  一个类内部发生变化，变现不同状态
		//  一个人不同阶段，做不同的事  ，青年 上学 ，中年 上班， 老年： 打麻将
		
		Context context = new Context();
		
		// 青年时候
		ConcreteStateA a = new ConcreteStateA();
		context.setState(a);
		context.request("青年");
		// 中年时候
		ConcreteStateB b = new ConcreteStateB();
		context.setState(b);
		context.request("中年");
		// 老年时候
		ConcreteStateC c = new ConcreteStateC();
		context.setState(c);
		context.request("老年");
		
	}
	
}
