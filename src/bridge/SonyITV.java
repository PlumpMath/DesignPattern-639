package bridge;

public class SonyITV implements ITV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("sony is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("sony is off");
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("sony set channel: - "+channel);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
