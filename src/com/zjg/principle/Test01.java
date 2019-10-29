package com.zjg.principle;

public class Test01 {
	
	public static void main(String[] args) {
		// 替换从军		
		HuaHu huaHu = new HuaMuLan();  // 继承树： 向上转型 
		huaHu.ride();
		huaHu.archery();
		// 打仗胜利，恢复女儿身
		if ( huaHu instanceof  HuaMuLan ) {
			HuaMuLan huamulan = (HuaMuLan)huaHu;  // 继承树： 向下转型
			huamulan.dress();
		}
	}
}

class HuaHu {
	
	public void ride() {
		System.out.println("花弧 骑马");
	}
	
	public void archery() {
		System.out.println("花弧 射箭");
	}
	
}

class HuaMuLan extends HuaHu {
	
	public void dress() {
		System.out.println("花木兰 梳妆");
	}
}
