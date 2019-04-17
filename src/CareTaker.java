/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

import java.util.ArrayList;
/**
 * Object stores list of mementos of ice cream states
 * @author Abel and Saul
 * @verison 1.0
 */
public class CareTaker {
	/**
	 * List of memento objects
	 */
	private ArrayList<Memento> mementos;
	
	/**
	 * Initialized ArrayList that stores all states of ice cream
	 */
	public CareTaker() {
		mementos = new ArrayList<Memento>();
	}
	
	/**
	 * Adds a state to the ArrayList
	 * @param state Memento state of ice cream object
	 */
	public void add(Memento state) {
		mementos.add(state);
	}
	
	/**
	 * Returns Memento state of ice cream object
	 * @param index index of which state is returned
	 * @return state of ice cream object
	 */
	public Memento get(int index) {
		return mementos.get(index);
	}
	
	/**
	 * Overriden toString method. Returns all mementos in list.
	 */
	public String toString() {
		String states = null;
		for(Memento mem : mementos) {
			states += (mem + "\n");
		}
		return states;
	}
}
