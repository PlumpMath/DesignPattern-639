package factorymethod;

/**
 * ���幤����ɫ
 * @author daiguohui
 *
 */
public class FactoryA implements Factory{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

}
