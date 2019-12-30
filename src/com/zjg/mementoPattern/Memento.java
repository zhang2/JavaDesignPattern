package com.zjg.mementoPattern;

public class Memento {
	
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
		this.state = state;
	}

	/**
	 * @param state
	 */
	public Memento(String state) {
		this.state = state;
	}
	
}
