package com.zjg.principle;

public class Test04 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.runRoad("汽车");
		vehicle.runAir("飞机");
		vehicle.runWater("船");
				
	}

}

class Vehicle {
	void runRoad(String vehicle) {
		System.out.println(vehicle+ "在公路上跑...");
	}
	
	void runAir(String vehicle) {
		System.out.println(vehicle+ "在天空上飞...");
	}
	
	void runWater(String vehicle) {
		System.out.println(vehicle+ "在水里游...");
	}
	
	
}


