package com.zjg.Iterator;
/**
 * 
 * @author apple
 * 
 * 测试类
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggregate ag=new ConcreteAggregate();
		ag.addObject(new Ticket("108次", "张"));
		ag.addObject(new Ticket("108次", "李"));
		ag.addObject(new Ticket("108次", "王"));
		ag.addObject(new Ticket("107次", "王"));
		ag.addObject(new Ticket("108次", "棒槌"));
	
		Iterator iterator = ag.iterator();
		// 遍历 火车票
		while(iterator.hasNext()) {
			 Ticket ob = (Ticket) iterator.next(); 
	         System.out.println(ob.toString()+"\t"); 
		}
//		Ticket ob = (Ticket) iterator.first();
//        System.out.println("\nFirst："+ob.toString());
	}

}
