package com.zjg.mementoPattern;

/**
 * 
 * 备忘发起角色
 * 保存一个对象的某个状态，以便在适当的时候恢复对象
 * 
 * */

public class Originator {
	private String state;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		System.out.println("current state is" + state);
		this.state = state;
	}
	
	public Memento crateMemento() {
		return new Memento(state);
	}
	
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}
}
