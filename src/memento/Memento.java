package memento;

public class Memento {
	private int blood;
	private int magicPoint;
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
	public Memento(int blood, int magicPoint)
	{
		this.blood = blood;
		this.magicPoint = magicPoint;
	}
}
