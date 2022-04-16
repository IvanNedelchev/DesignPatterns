package Command_Observer_FactoryMethod;


public interface Observable {
	void attach(Observer observer);
	void detach(Observer observer);
	
	void notifyObservers();
	String getUpdate();
}
