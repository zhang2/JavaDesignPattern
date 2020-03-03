package com.zjg.compositePattern;

/**
 * 
 * @author apple
 * 
 * 叶子构件
 * 
 * 没有子节点
 *
 */
public class Leaf extends Component {
	
	private String name;
	
	/**
	 * @param name
	 */
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		 System.out.println("树叶"+name+"：被访问！"); 
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
