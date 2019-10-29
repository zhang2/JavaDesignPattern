package com.zjg.observe.demo;


/**
 * 
 * @author apple
 * 
 * 张警官抓捕小偷
 *
 */
public class MrZhang implements PoliceMan {

	String name;
	
	
	
	public MrZhang(String name) {
		super();
		this.name = name;
	}

	@Override
	public void catchThief() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "有贼人偷东西，赶紧抓捕");
		
	}

}
