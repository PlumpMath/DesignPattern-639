package singleton;

public class Singleton2 {
	private  Singleton2 singleton ;
	private Singleton2(){
		
	}
	public  Singleton2 getSingleton(){
		if(singleton ==null){
			synchronized (Singleton2.class) {
				if(singleton == null) singleton = new Singleton2();
			}
			
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
