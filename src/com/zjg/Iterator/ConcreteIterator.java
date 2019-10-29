package com.zjg.Iterator;

import java.util.List;

/**
 * 
 * @author apple
 *
 * @param <T>
 * 
 * 具体迭代器
 */

public class ConcreteIterator<T> implements Iterator<T> {
	
	private List<T> list = null;
	
	private int index = -1; 
	
	
	public ConcreteIterator(List<T> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (list.size() -1 > index) {
			return true;
		} else {
			return false;	
		}
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		index = 0;
		T ticket = list.get(index); 
		return ticket;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T ticket  = null;
		if (this.hasNext()) {
			ticket = list.get(++index);
		}
		return ticket;
	}

}
