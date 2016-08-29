package builder;

/**
 * ²úÆ·½ÇÉ«
 * @author daiguohui
 *
 */
public class StarBucks {
	private String size;
	private String drink;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	@Override
	public String toString() {
		return "StarBucks [size=" + size + ", drink=" + drink + "]";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
