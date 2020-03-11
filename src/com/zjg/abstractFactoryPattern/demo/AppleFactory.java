package com.zjg.abstractFactoryPattern.demo;

public class AppleFactory  extends AbstractFactory {

	@Override
	public Phone producePhone() {
		// TODO Auto-generated method stub
		return new ApplePhone();
	}

	@Override
	public Desktop produceDesktop() {
		// TODO Auto-generated method stub
		return new AppleDesktop();
	}

	@Override
	public Tablets produceTablets() {
		// TODO Auto-generated method stub
		return new AppleTablets();
	}

	@Override
	public NoteBook producNoteBook() {
		// TODO Auto-generated method stub
		return new AppleNoteBook();
	}

}
