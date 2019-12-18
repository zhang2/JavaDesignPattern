/**
 * 
 */
package com.zjg.visitorPattern;

/**
 * @author apple
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Blogs blogs = new Blogs();
		blogs.addBlog(new BlogElement("这是第一篇博文"));
        blogs.addBlog(new BlogElement("这是第二篇博文"));
        blogs.addBlog(new BlogElement("这是第三篇博文"));
        blogs.addBlog(new BlogElement("这是第四篇博文"));

        Visitor webVisit = new WebVisitor();
        Visitor wapVisit = new WapVisitor();

        blogs.accept(webVisit);
        blogs.accept(wapVisit);
        
	}

}

/*
 * 
 * 六个角色：

        抽象访问者(Visitor)、具体访问者(ConcreteVisitor)、抽象元素(Element)、具体元素(ConcreteElement)、对象结构类(ObjectStructure)、客户端(Client) 

        抽象访问者(Visitor)：抽象出访问元素的动作

        具体访问者(ConcreteVisitor)：实现访问元素的动作

        抽象元素(Element)：定义一个接受访问的操作，其参数为访问者

        具体元素(ConcreteElement)：实现接受访问操作

        对象结构类(ObjectStructure)：可以枚举元素，并且管理元素

        客户端(Client) ：定义元素集合，然后接受不同访问者的访问
 * */

/*
 实现思路
 向对象结构类中添加元素，然后定义多种访问者，使用对象结构类去接受访问者即可。 
 * */




