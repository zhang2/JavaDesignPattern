package com.zjg.visitorPattern;

public class WapVisitor extends Visitor {

	@Override
	public void VisitBlog(Element element) {
		// TODO Auto-generated method stub
		System.out.println("通过手机wep网站方式访问Blog:" + element.blogName);
		
	}

}
