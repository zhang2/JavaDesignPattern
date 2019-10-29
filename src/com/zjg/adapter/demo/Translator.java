package com.zjg.adapter.demo;

/**
 * 
 * @author apple
 * 
 *  Translator 转化器 Adapter ， 转化接口， 拿到原有接口，加以修改	
 */
public class Translator extends PS2Mouse implements IUSB {

	@Override
	public void hasUSB() {
		// TODO Auto-generated method stub
		hasPS2();
		System.out.println("将 ps2 转换为 usb 接口");
		
	}

}
