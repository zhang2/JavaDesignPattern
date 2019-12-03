package om.zjg.abstractFactoryPattern.demo;

public class XiaoMiFactory extends AbstractFactory {

	@Override
	public Phone producePhone() {
		// TODO Auto-generated method stub
		return new XiaoMiPhone();
	}

	@Override
	public Desktop produceDesktop() {
		// TODO Auto-generated method stub
		return new XiaoMiDesktop();
	}

	@Override
	public Tablets produceTablets() {
		// TODO Auto-generated method stub
		return new XiaoMiTablets();
	}

	@Override
	public NoteBook producNoteBook() {
		// TODO Auto-generated method stub
		return new XiaoMiNoteBook();
	}

}
