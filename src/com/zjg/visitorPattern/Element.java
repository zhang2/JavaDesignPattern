package com.zjg.visitorPattern;

public abstract class Element {
	
    abstract public void accept(Visitor visotr);
    
    String blogName;

	/**
	 * @return the blogName
	 */
	public String getBlogName() {
		return blogName;
	}

	/**
	 * @param blogName the blogName to set
	 */
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
    
    
}
