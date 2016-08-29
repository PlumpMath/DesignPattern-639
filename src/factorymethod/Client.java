package factorymethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory a  = new FactoryA();
		a.buildProduct().doUse();
		Factory b  = new FactoryB();
		b.buildProduct().doUse();
	}

}
