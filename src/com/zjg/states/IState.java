package com.zjg.states;

/**
 * @author apple
 * 
 * 状态类
 *
 */
public interface IState {
	/*
	 * 状态对应的处理
	 */
	public void handle(String sampleParameter);
}
