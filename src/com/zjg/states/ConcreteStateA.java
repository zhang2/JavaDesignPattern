package com.zjg.states;

public class ConcreteStateA implements IState {

	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		if (sampleParameter == "青年") {
			System.out.println("青年的状态：读书学习耍盆友");	
		}
	}
	
}
