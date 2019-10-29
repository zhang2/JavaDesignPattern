package com.zjg.observe.demo;

import java.util.ArrayList;
import java.util.List;


public abstract class Thief {
	
	private List<PoliceMan> policeMans = new ArrayList<PoliceMan>();
	
	void attachPoliceMan(PoliceMan policeMan) {
		policeMans.add(policeMan);
	}
	void detachPoliceMan(PoliceMan policeMan) {
		policeMans.remove(policeMan);
	}
	void notifyPoliceMan() {
		for (PoliceMan policeMan : policeMans) {
			policeMan.catchThief();
		}
	}
	
}
