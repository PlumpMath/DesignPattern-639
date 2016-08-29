package builder;

public class TeaBuilder extends Builder{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		starBucks.setDrink("medium");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		starBucks.setDrink("tea");
	}

}
