package com.zjg.mvp;

public class Presenter implements ViewAction {
	
	private View view;
	
	private Model model;
	
	/**
	 * @param view
	 */
	public Presenter(View view) {
		super();
		this.view = view;
	}

	public void requestData() {
		
		Model model = new Model();
		model.email =  "ggg";
		model.firstName = "bbb";
		model.lastName = "ccc";
		this.model = model;
		updateView(model);
		
	}
	
	public void updateView(Model model) {
		
		this.view.showModel(model.firstName, model.lastName, model.email);
		
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		// 修改model
		this.model.email = "dddddddd";
		updateView(this.model);
		
	}

}
