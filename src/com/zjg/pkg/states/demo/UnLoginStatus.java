package com.zjg.pkg.states.demo;

public class UnLoginStatus extends Login {

	public UnLoginStatus(IStatus status) {
		super(status);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void showLoginInfo() {
		// TODO Auto-generated method stub
		System.out.println("未登录");
		super.showLoginInfo();
	}

}
