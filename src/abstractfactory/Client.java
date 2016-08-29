package abstractfactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryA a = new FactoryA();
		a.buildComputer().doUse();
		a.buildTelePhone().doUse();
	}

}
