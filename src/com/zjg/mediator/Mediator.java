package com.zjg.mediator;

public abstract class Mediator {
	
	public abstract void register(Colleague colleague);
	public abstract void relay(Colleague cl); //转发
	
}
