package factorymethod;

/**
 * 具体工厂角色
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
