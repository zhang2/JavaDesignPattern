package com.zjg.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author apple
 * 
 * 负责保存好备忘录。
 *
 */
public class Caretaker {
	
	private List<Memento> mementoList =new ArrayList<Memento>();
	
	public Memento retieveMemento(int dex) {
        return mementoList.get(dex);
    }
 
    public void setMemento(Memento memento) {
        mementoList.add(memento);
    }
}
