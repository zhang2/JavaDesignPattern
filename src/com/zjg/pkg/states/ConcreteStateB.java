package com.zjg.pkg.states;

public class ConcreteStateB implements IState {

	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		if (sampleParameter == "中年") {
			System.out.println("中年的状态：加班加班加班");	
		}
	}
	
}
