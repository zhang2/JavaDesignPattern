package com.zjg.command;

public class ConcreteCommandB implements Command{

	private Receiver receiver;
	
	
	public ConcreteCommandB(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.turnOff();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.receiver.turnOn();
	}

}
