package com.zjg.abstractFactoryPattern.demo;

public class HuaWeiFactory extends AbstractFactory {

	@Override
	public Phone producePhone() {
		// TODO Auto-generated method stub
		return new HuaWeiPhone();
	}

	@Override
	public Desktop produceDesktop() {
		// TODO Auto-generated method stub
		return new HuaWeiDesktop();
	}

	@Override
	public Tablets produceTablets() {
		// TODO Auto-generated method stub
		return new HuaWeiTablets();
	}

	@Override
	public NoteBook producNoteBook() {
		// TODO Auto-generated method stub
		return new HuaWeiNoteBook();
	}

}
