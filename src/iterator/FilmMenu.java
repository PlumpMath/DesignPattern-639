package iterator;

public class FilmMenu implements Menu {
	
	Element[] elements;
	private final int MAX_SIZE = 5;
	int numOfElem = 0;
	public FilmMenu(){
		elements = new Element[MAX_SIZE];
		addElem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
		addElem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
		addElem(3, "黑客帝国123", "不知道你能够看懂不???");
		addElem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
		addElem(5, "肖申克的救赎", "自由，幸福，离你有多远");
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
