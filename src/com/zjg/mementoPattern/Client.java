/**
 * 
 */
package com.zjg.mementoPattern;

/**
 * @author apple
 *
 * 记录一个软件内部状态
 * 
 * 允许用户取消不确定的操作，或者从错误中恢复过来
 * 
 * 需要实现备份和撤销机制 
 *
 * 必须事先将状态信息保存在某处，这样才能将对象恢复到它们原先的状态
 * 
 * */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("ON");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.crateMemento());
        originator.setState("OFF");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.crateMemento());
        originator.restoreMemento(caretaker.retieveMemento(1));
        System.out.println(originator.getState());
	}

}

