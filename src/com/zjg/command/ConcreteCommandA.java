package com.zjg.command;

public class ConcreteCommandA implements Command {

	private Receiver receiver;
	
	
	public ConcreteCommandA(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.turnOn();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.receiver.turnOff();
		
	}

}
