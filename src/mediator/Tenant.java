package mediator;

public class Tenant extends Person {

	public Tenant(String nameString, Mediator mediator) {
		super(nameString, mediator);
		// TODO Auto-generated constructor stub
	}
	public void contact(String message){
		mediator.contact(message, this);
	}
	public void getMessage(String message){
		System.out.println("tenant  get message "+message);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
