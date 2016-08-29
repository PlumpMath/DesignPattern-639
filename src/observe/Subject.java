package observe;

public interface Subject {
	public void registerObserver(Observe obj);
	public void removeObserver(Observe obj);
	public void notifyObserver();
}
