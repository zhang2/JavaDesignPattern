package com.zjg.pkg.states.demo;

public class LoginStatus extends Login {

	public LoginStatus(IStatus status) {
		super(status);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void showLoginInfo() {
		// TODO Auto-generated method stub
		System.out.println("登录");
		super.showLoginInfo();
	}
}
