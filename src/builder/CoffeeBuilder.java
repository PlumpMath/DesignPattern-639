package builder;
/**
 * ���彨���߽�ɫ
 * @author daiguohui
 *
 */
public class CoffeeBuilder extends Builder{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		starBucks.setSize("large");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		starBucks.setDrink("coffee");
	}

}
