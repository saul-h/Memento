/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

import java.util.ArrayList;
/**
 * Holds state information of AdvancedIceCreamCone object
 * @author Abel and Saul
 * @version 1.0
 */
public class Memento {
	
	/**
	 * State of AdvancedIceCreamObject saved
	 */
	private AdvancedIceCreamCone iceCream;
	
	/**
	 * Creates AdvancedIceCreamCone object and stores it in private field
	 * @param iceCream AdvancedIceCreamCone you want to save
	 */
	public Memento(AdvancedIceCreamCone iceCream) {
		int numOfScoop = iceCream.getNumberOfScoops();
		String flav = iceCream.getFlavor();
		String cone = iceCream.getTypeOfCone();
		ArrayList<String> toppings = iceCream.getToppings();
		
		this.iceCream = new AdvancedIceCreamCone(numOfScoop, flav, cone);
		for(String topping : toppings) {
			this.iceCream.addToppings(topping);
		}
		
	}
	
	/**
	 * Returns the state of AdvancedIceCreamCone saved
	 * @return AdvacedIceCreamCone
	 */
	public AdvancedIceCreamCone getState() {
		return iceCream;
	}
	
	/**
	 * Overriden toString method. Return String of AdvancedIceCreamCone information
	 */
	@Override
	public String toString() {
		return String.format(	"State: %5d%10s%10s", 
								iceCream.getNumberOfScoops(), 
								iceCream.getFlavor(), 
								iceCream.getTypeOfCone());
	}
}
