package com.zjg.compositePattern;

import java.util.ArrayList;

/**
 * 
 * @author apple
 * 
 * 容器构件
 * 
 * 定义有枝节点行为
 * 
 * 在Component接口中实现与子部件的有关操作
 * 
 * add, remove
 */
public class Composite extends Component {
	
	private ArrayList<Component> children=new ArrayList<Component>();

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for (Component component : children) {
			component.operation();
		}
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return children.get(i);
	}  

}
