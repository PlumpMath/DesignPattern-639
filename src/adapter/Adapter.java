package adapter;

public class Adapter extends Target{
	Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void request(){
		adaptee.specialRequest();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		adapter.request();
	}

}
