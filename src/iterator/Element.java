package iterator;

public class Element {

	private int channel;
	private String name ;
	private String describle;
	public Element(int channel,String name , String describle){
		this.channel = channel;
		this.name = name;
		this.describle = describle;
	}
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrible() {
		return describle;
	}

	public void setDescrible(String describle) {
		this.describle = describle;
	}

	@Override
	public String toString() {
		return "Element [channel=" + channel + ", name=" + name
				+ ", describle=" + describle + "]";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
