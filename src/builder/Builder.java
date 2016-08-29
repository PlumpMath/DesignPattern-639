package builder;


/**
 * 抽象建造者角色
 * @author daiguohui
 *
 */
public abstract class Builder {
	
	StarBucks starBucks;
	
	public StarBucks getStarBucks() {
		return starBucks;
	}
	public void createStarBuck(){
		starBucks = new StarBucks();
	}
	abstract public void  buildSize();
	abstract public void buildDrink();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
