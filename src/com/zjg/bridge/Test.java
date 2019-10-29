package com.zjg.bridge;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 折叠式手机 （样式 + 品牌）
		FoldePhone  foldePhone = new FoldePhone(new XiaoMi());
		foldePhone.open();
		foldePhone.close();
		foldePhone.call();
		
		System.out.println("==========================");
		
		FoldePhone  foldePhone2 = new FoldePhone(new Vivo());
		foldePhone2.open();
		foldePhone2.close();
		foldePhone2.call();
		
		System.out.println("==========================");
		// 直立式手机 （样式 + 品牌）
		UpRightPhone  upRightPhone = new UpRightPhone(new Vivo());
		upRightPhone.open();
		upRightPhone.close();
		upRightPhone.call();
		
	}

}

/**
 * 
 * 桥接模式：实现与抽象放在不同的类层次中，使两个层次可以独立改变
 * 
 * 是一种结构型设计
 * 
 * 基于最小类的设计原则
 * 
 * 
 */