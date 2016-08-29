package iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilmMenu filmMenu = new FilmMenu();
		Iterator iterator = filmMenu .creatIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
