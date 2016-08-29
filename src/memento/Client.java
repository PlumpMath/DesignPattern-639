package memento;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role role = new Role(100, 100);
		role.display();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(role.saveMemento());
		
		role.setBlood(20);
		role.setMagicPoint(30);
		role.display();
		
		role.restore(caretaker.getMemento());
		role.display();
	}

}
