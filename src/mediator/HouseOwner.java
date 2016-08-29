package mediator;

public class HouseOwner extends Person {

	
	public HouseOwner(String nameString, Mediator mediator) {
		super(nameString, mediator);
		// TODO Auto-generated constructor stub
	}
	public void contact(String message){
		mediator.contact(message, this);
	}
	public void getMessage(String message){
		System.out.println("houseOwner get message "+message);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
