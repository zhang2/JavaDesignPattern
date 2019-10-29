package com.zjg.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author apple
 *
 * @param <T>
 * 
 * 具体集合类
 * 
 */

public class ConcreteAggregate<T>  implements Aggregate<T> {

	private List<T> list=new ArrayList<T>();
	
	@Override
	public void addObject(T object) {
		// TODO Auto-generated method stub
		list.add(object);
	}

	@Override
	public void deleteObject(T object) {
		// TODO Auto-generated method stub
		list.remove(object);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return  new ConcreteIterator<T>(list);
		
	}

}
