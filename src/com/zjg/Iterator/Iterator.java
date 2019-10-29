/**
 * 
 */
package com.zjg.Iterator;

/**
 * @author apple
 * 
 * 迭代器接口
 *
 */
public interface Iterator<T> {
	// 判断是否有下一个元素
	boolean hasNext();
	
	T first();
	
	// 返回当前位置的元素并将位置移至下一位
	T next();
}
