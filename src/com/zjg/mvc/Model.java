package com.zjg.mvc;

public class Model {
	
	String name;
	
	int age;

	
	
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Model [name=" + name + ", age=" + age + "]";
	}
}
