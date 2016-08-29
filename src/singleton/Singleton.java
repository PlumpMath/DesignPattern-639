package singleton;

public class Singleton {
	private Singleton singleton;
	public  Singleton getSingleton(){
		if(singleton ==null){
			singleton = new Singleton();
		}
		return singleton;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
