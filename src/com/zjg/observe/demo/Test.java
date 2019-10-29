package com.zjg.observe.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiefLiXuHuan thief = new ThiefLiXuHuan();
		
		MrZhang policeMan = new  MrZhang("张警官");
		
		MrZhang policeMan1 = new  MrZhang("李警官");
		
		MrZhang policeMan2 = new  MrZhang("王警官");
		
		thief.attachPoliceMan(policeMan);
		thief.attachPoliceMan(policeMan1);
		thief.attachPoliceMan(policeMan2);
		
		thief.steal();
		
		System.out.println("==================");
		
		thief.detachPoliceMan(policeMan);
		
		thief.steal();
		
	}

}
