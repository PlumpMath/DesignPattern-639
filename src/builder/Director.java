package builder;
/**
 * ���ݽ�ɫ
 * @author daiguohui
 *
 */
public class Director {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		coffeeBuilder.createStarBuck();
		coffeeBuilder.buildDrink();
		coffeeBuilder.buildSize();
		System.out.println(coffeeBuilder.getStarBucks());
	}

}
