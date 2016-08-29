package decorator;

public class Client {
	public static void main(String[] args) {
		Beverage beverage= new DarkRoast();
		beverage  = new Milk(beverage);
		beverage = new Moca(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
	}
}
