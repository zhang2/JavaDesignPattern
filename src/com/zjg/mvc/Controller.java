package com.zjg.mvc;

public class Controller {
	
	private Model model;
	
	private View view;
	
	public Controller(Model model, View view) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.view = view;
	}
	
	public void  modifyName(String name) {
		model.setName(name);
	}
	
	public void  modifyage(int age) {
		model.setAge(age);
	}
	
	public void updateView() {
		view.showModel(model.name, model.age);
	}

}
