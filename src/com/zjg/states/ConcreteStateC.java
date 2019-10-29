package com.zjg.states;

/**
 * @author apple
 *
 */
public class ConcreteStateC implements IState {

	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		if (sampleParameter == "老年") {
			System.out.println("老年的状态：开心啊，打麻将");	
		}
	}

}
