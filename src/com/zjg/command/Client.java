package com.zjg.command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Receiver receiver = new Receiver();
		ConcreteCommandA concreteCommand = new ConcreteCommandA(receiver);
		Invoker invoker = new Invoker(concreteCommand);
		invoker.call();
	}

}
