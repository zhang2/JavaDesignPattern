package com.zjg.templateMethodPattern;

public class ConCreateTemplate extends Template {

	
	// 钩子方法, 重写父类的方法控制是否有推荐信 
	@Override
	protected boolean isUseDefineRecommendLetter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void defineName() {
		// TODO Auto-generated method stub
		System.out.println("写上名字");
	}

	@Override
	public void defineInfo() {
		System.out.println("写上个人信息");
	}

	@Override
	public void defineExperience() {
		// TODO Auto-generated method stub
		System.out.println("写上工作经历");
	}

	@Override
	public void defineRecommendLetter() {
		// TODO Auto-generated method stub
		System.out.println("写上推荐信");
	}
}
