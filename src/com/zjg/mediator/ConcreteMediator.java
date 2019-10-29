package com.zjg.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
	 private List<Colleague> colleagues=new ArrayList<Colleague>();

	@Override
	public void register(Colleague colleague) {
		// TODO Auto-generated method stub
		 if(!colleagues.contains(colleague))
	        {
	            colleagues.add(colleague);
	            colleague.setMedium(this);
	        }
	}

	@Override
	public void relay(Colleague cl) {
		// TODO Auto-generated method stub
		 for(Colleague ob:colleagues)
	        {
	            if(!ob.equals(cl))
	            {
	                ((Colleague)ob).receive();
	            }   
	        }
	}
}
