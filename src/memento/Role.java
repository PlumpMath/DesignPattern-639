package memento;

import iterator.Menu;

public class Role {

	private int blood;
	private int magicPoint;
	public Role(int blood, int magicPoint){
		this.blood = blood;
		this.magicPoint = magicPoint;
	
	}
	
	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}
	public Memento saveMemento(){
		return new Memento(blood,magicPoint);
	}
	public void restore(Memento memento){
		this.blood = memento.getBlood();
		this.magicPoint = memento .getMagicPoint();
	}
	public void display(){
		System.out.println("blood "+blood+" magicPoint "+magicPoint);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
