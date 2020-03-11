package com.zjg.mvc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model = new Model();
		model.setAge(20);
		model.setName("zhang san ye");
		
		View view = new View();
		
		Controller controller = new Controller(model, view);
		
		controller.updateView();
		
		controller.modifyage(22);
		
		controller.modifyName("xue ba");
		
		controller.updateView();
		
	}

}

/*
 * 
 * 在MVC里，View是可以直接访问Model的！
 * 从而，View里会包含Model信息，不可避免的还要包括一些业务逻辑。
 * 在MVC模型里，更关注的Model的不变，而同时有多个对Model的不同显示，及View。
 * 所以，在MVC模型里，Model不依赖于View，但是View是依赖于Model的。
 * 不仅如此，因为有一些业务逻辑在View里实现了，导致要更改View也是比较困难的，至少那些业务逻辑是无法重用的。
 * 
 * 
 * */