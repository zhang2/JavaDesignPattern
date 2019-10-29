package com.zjg.pkg.states.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnLoginStatus unLoginStatus1 = new UnLoginStatus(new StatusA());
		unLoginStatus1.showLoginInfo();
		
		UnLoginStatus unLoginStatus2 = new UnLoginStatus(new StatusB());
		unLoginStatus2.showLoginInfo();

		
		LoginStatus loginStatus1 = new LoginStatus(new StatusA());
		loginStatus1.showLoginInfo();
		
		LoginStatus loginStatus2 = new LoginStatus(new StatusB());
		loginStatus2.showLoginInfo();

	}

}
