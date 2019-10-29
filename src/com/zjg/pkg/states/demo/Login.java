package com.zjg.pkg.states.demo;

public abstract class Login {
	private IStatus status;

	public Login(IStatus status) {
		super();
		this.status = status;
	}
	
	protected void showLoginInfo() {
		this.status.showInfo();
	}
}
