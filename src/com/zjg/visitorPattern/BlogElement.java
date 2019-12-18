package com.zjg.visitorPattern;

public class BlogElement extends Element {

	public BlogElement(String blogNmae) {
		this.blogName = blogNmae;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.VisitBlog(this);
	}
}
