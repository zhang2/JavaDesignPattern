package com.zjg.bridge;

public class FoldePhone extends Phone {

	public FoldePhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.open();
		System.out.println("折叠样式手机");
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		super.close();
		System.out.println("折叠手机关机");
	}
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("折叠手机打电话");
	}
}
