package om.zjg.abstractFactoryPattern.demo;

public abstract class AbstractFactory {

	public abstract Phone producePhone();
	
	public abstract Desktop produceDesktop();
	
	public abstract Tablets produceTablets();
	
	public abstract NoteBook producNoteBook();
	
}
