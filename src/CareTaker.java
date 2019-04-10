import java.util.ArrayList;

public class CareTaker {
	private ArrayList<Memento> mementos;
	
	public CareTaker() {
		mementos = new ArrayList<Memento>();
	}
	
	public void add(Memento state) {
		mementos.add(state);
	}
	
	public Memento get(int index) {
		return mementos.get(index);
	}
}
