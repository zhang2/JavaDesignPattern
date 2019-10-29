package com.zjg.pkg.states;

/**
 * 
 * @author apple
 *
 * 环境类
 *
 */
public class Context {
	private IState state;

	public void setState(IState state) {
		this.state = state;
	}
	
	public void request(String sampleParameter) {
		this.state.handle(sampleParameter);
	}
}
