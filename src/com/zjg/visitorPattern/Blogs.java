package com.zjg.visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Blogs {
	
 	private List<Element> blogList=new ArrayList<>();
 	
 	public void addBlog(Element element) {
 		blogList.add(element);
 	}
 	
 	public void removeBlog(Element element) {
 		blogList.remove(element);
 	}
 	
 	public void accept(Visitor visitor) {
 		for (Element element : blogList) {
 			element.accept(visitor);	
		}
 		
 	}
}
