/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

public class Originator {
	
	AdvancedIceCreamCone iceCream;
	
	public void setState(AdvancedIceCreamCone iceCream) {
		this.iceCream = iceCream;
	}
	
	public AdvancedIceCreamCone getState() {
		return iceCream;
	}
	
	public Memento saveStateToMemento(){
	      return new Memento(iceCream);
	}
	
	public void getStateFromMemento(Memento m) {
		this.iceCream = m.getState();
	}
	
	public String toString() {
		return "Originator state: " + iceCream;
	}
}
