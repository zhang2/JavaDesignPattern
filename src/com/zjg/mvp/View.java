package com.zjg.mvp;

public class View {
	
	void showModel(String fistName, String lastName, String email) {
		System.out.println("fistName"+ fistName + "lastName" + lastName +"email" + email);
	}
}

interface ViewAction {
	
	void doSomething();
	
}