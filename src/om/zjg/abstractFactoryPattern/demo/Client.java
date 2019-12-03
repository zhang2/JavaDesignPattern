/**
 * 
 */
package om.zjg.abstractFactoryPattern.demo;

/**
 * @author apple
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = null;
		
		factory = new HuaWeiFactory();
		factory.producePhone();
		factory.producNoteBook();
		
		factory = new XiaoMiFactory();
		factory.produceDesktop();
		factory.produceTablets();
		
	}

}
