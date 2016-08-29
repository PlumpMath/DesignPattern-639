package factorymethod;

public class FactoryB implements Factory{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
