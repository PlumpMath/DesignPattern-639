package bridge;

public class SamSungIETV implements ITV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("samsung is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("samsung is off");
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("samsung set channel: - "+channel);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
