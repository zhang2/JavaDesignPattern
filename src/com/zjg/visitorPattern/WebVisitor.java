package com.zjg.visitorPattern;

public class WebVisitor extends  Visitor {

	@Override
	public void VisitBlog(Element element) {
		// TODO Auto-generated method stub
		System.out.println("通过电脑web网站方式访问Blog:" + element.blogName);
	}
	
	

}
