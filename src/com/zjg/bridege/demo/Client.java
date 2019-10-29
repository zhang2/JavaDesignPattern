package com.zjg.bridege.demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	不同操作系统，显示不同格式的图片， 维度一：操作平台（Windows Linux Mobile），维度二：图片格式（JPG, PDF, PNG）
		
		//	Mobile ： PNG
		Mobile mobile = new Mobile(new PNG());
		mobile.operatingSystemtype();
		//	Linux ： PDF
		Linux linux = new Linux(new PDF());
		linux.operatingSystemtype();
		//	Windows ： JPG
		Windows windows = new Windows(new JPG());
		windows.operatingSystemtype();
		
	}

}
