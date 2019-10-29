package com.zjg.proxy;
/**
 * 
 * @author apple
 * 
 * 代理类
 *
 */
public class Lawyer implements ICase {

	private ICase icase;
	
	public Lawyer(ICase icase) {
		super();
		this.icase = icase;
	}

	private void checkoutMaterials() {
		System.out.println("审核官司材料");
	}
	
	@Override
	public void casehandle() {
		// TODO Auto-generated method stub
		
		checkoutMaterials();
		this.icase.casehandle();
	}
}
