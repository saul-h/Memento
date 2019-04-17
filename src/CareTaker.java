/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

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
	
	public String toString() {
		String states = null;
		for(Memento mem : mementos) {
			states += (mem + "\n");
		}
		return states;
	}
}
