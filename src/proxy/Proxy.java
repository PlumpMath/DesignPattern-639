package proxy;

public class Proxy extends Subject {
	private Subject subject;
	public Proxy(Subject realSubject){
		subject = realSubject;
	}
	

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("proxy operation");
		subject.operation();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject realSubject = new RealSubject();
		Proxy proxy = new Proxy(realSubject);
		proxy.operation();
	}

}
