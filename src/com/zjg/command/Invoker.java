package com.zjg.command;

public class Invoker {
	private Command command;
	public void call() {
		this.command.execute();
	}
	
	public Invoker(Command command) {
		this.command = command;
	}
}
