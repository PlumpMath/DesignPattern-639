package bridge;

public class ConcreteControl extends RemoteControl {
	
	public ConcreteControl(ITV tv){
		super(tv);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITV tv = new SamSungIETV();
		ConcreteControl control = new ConcreteControl(tv);
		control.on();
		control.setChannel(2);

	}

}
