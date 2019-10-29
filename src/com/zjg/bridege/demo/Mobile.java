package com.zjg.bridege.demo;

/**
 * 
 * @author apple
 * 
 * Mobile
 *
 */
public class Mobile extends OperatingSystem {

	public Mobile(IPictureFormat pictureFormat) {
		super(pictureFormat);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void operatingSystemtype() {
		// TODO Auto-generated method stub
		super.operatingSystemtype();
		System.out.println(" 图片显示在 Mobile");
	}
}
