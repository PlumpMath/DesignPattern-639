package iterator;

public class FilmMenu implements Menu {
	
	Element[] elements;
	private final int MAX_SIZE = 5;
	int numOfElem = 0;
	public FilmMenu(){
		elements = new Element[MAX_SIZE];
		addElem(1, "�������", "���ǲ�³˹����˹���ݵ�...");
		addElem(2, "���������", "��������ϲ���ĵ�Ӱ֮һ...");
		addElem(3, "�ڿ͵۹�123", "��֪�����ܹ�������???");
		addElem(4, "�ҵ�Ů���ǻ�����", "һ���Ҳ����еľ��䰮���Ӱ...");
		addElem(5, "Ф��˵ľ���", "���ɣ��Ҹ��������ж�Զ");
	}
	@Override
	public void addElem(int channel, String name, String describle) {
		// TODO Auto-generated method stub
		elements[numOfElem++] = new Element(channel, name, describle);
	}

	@Override
	public Iterator creatIterator() {
		// TODO Auto-generated method stub
		return new FilmIterator(elements);
	}

}
