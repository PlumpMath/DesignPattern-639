package iterator;

public class FilmIterator implements Iterator {

	Element[] elements;
	int position = 0;
	
	public FilmIterator(Element [] elements){
		this.elements = elements;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position > elements.length -1||elements[position] == null){
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		
		return elements[position++];
	}

}
