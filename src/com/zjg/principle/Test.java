package com.zjg.principle;

import java.util.ArrayList;

public class Test {
	
	private final static ArrayList<ICar> carList = new ArrayList<ICar>();
	
	static {
		carList.add(new Car("red", 4));
		carList.add(new Car("white", 2));
		carList.add(new NewCar("black", 4, "谷歌导航"));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (ICar car : carList) {
//			car.toString();
			System.out.println(car.toString());
		}
	}
}

// 描述车的属性，颜色，轮胎个数，现在加装一个导航仪

 interface ICar {
	
	 String getColor();
	 
	 int getWheels();
	 
}
 
 interface INewCar extends ICar {
	 
	 String getNavgation();
	 
 }
 
 class Car implements ICar {

	private String color;

	private int wheels;

	 
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}
	 
	public Car(String color, int wheels) {
		this.color = color;
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", wheels=" + wheels + "]";
	}
	
	
	
 }
 
 class NewCar implements INewCar {

	private String color;

	private int wheels;
	
	private String navgation;

	public NewCar(String color, int wheels, String navgation) {
		this.color = color;
		this.wheels = wheels;
		this.navgation = navgation;
	} 
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return wheels;
	}

	@Override
	public String getNavgation() {
		// TODO Auto-generated method stub
		return navgation;
	}

	@Override
	public String toString() {
		return "NewCar [color=" + color + ", wheels=" + wheels + ", navgation=" + navgation + "]";
	}
	 
 }
 
 