package com.zjg.bridege.demo;

public class Linux extends OperatingSystem {

	public Linux(IPictureFormat pictureFormat) {
		super(pictureFormat);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void operatingSystemtype() {
		// TODO Auto-generated method stub
		super.operatingSystemtype();
		System.out.println(" 图片显示在 Linux");
	}
}
