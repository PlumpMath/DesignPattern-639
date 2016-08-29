package abstractfactory;

public class FactoryA  implements AbstactFactory{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Computer buildComputer() {
		// TODO Auto-generated method stub
		return new DesktopComputer();
	}

	@Override
	public TelePhone buildTelePhone() {
		// TODO Auto-generated method stub
		return new Phone();
	}

}
