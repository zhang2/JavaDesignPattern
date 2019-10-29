package com.zjg.observe.demo;

/**
 * 
 * @author apple
 * 
 * 偷东西的贼人 李寻欢
 *
 */
public class ThiefLiXuHuan extends Thief {

	void steal() {
		super.notifyPoliceMan();
	}
}
