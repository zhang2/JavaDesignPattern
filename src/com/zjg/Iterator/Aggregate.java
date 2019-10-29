
package com.zjg.Iterator;

/**
 * @author apple
 * 
 * 容器接口
 * 
 * 添加/删除元素
 * 
 * 获取容器迭代器
 *
 */
public interface Aggregate<T> {
	void addObject(T object);
	void deleteObject(T object);
	public Iterator<T> iterator();
}
