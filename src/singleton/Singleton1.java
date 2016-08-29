package singleton;

public class Singleton1 {
	private static Singleton1 singleton = new Singleton1();
	public  Singleton1 getSingleton(){
		if(singleton ==null){
			singleton = new Singleton1();
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
