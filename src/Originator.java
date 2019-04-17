/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

/**
 * Holds current state of AdvancedIceCreamCone. Used with CareTaker to save
 * AdvacedIceCream cone state
 * @author Abel and Saul
 * @version 1.0
 */
public class Originator {
	/**
	 * Stores current state of AdvancedIceCreamCone
	 */
	AdvancedIceCreamCone iceCream;
	
	/**
	 * Default constructor
	 */
	public Originator() {
		
	}
	
	/**
	 * Sets field to current state of AdvancedIceCreamCone
	 * @param iceCream the AdvancedIceCreamCone you want to save the state of
	 */
	public void setState(AdvancedIceCreamCone iceCream) {
		this.iceCream = iceCream;
	}
	
	/**
	 * Gets the state of AdvancedIceCreamCone
	 * @return AdvancedIceCreamCone
	 */
	public AdvancedIceCreamCone getState() {
		return iceCream;
	}
	
	/**
	 * Returns instance of Memento. Pass this with CareTaker to save state in list
	 * @return Memento of AdvancedIceCreamCone
	 */
	public Memento saveStateToMemento(){
	      return new Memento(iceCream);
	}
	
	/**
	 * Sets the state of AdvancedIceCreamCone to field
	 * @param m Memento you want to get object from
	 */
	public void getStateFromMemento(Memento m) {
		this.iceCream = m.getState();
	}
	
	/**
	 * Overriden toString method. Returns String of AdvancedIceCreamCone toString
	 */
	public String toString() {
		return "Originator state: " + iceCream;
	}
}
