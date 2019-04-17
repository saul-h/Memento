/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

public class Main {
	public static void main(String [] args) {
		// Creating ice creams
		AdvancedIceCreamCone chocolateIceCream = new AdvancedIceCreamCone(2, "Chocolate", "Regular");
		AdvancedIceCreamCone vanillaIceCream = new AdvancedIceCreamCone(1, "Vanilla", "Waffle");
		AdvancedIceCreamCone strawberryIceCream = new AdvancedIceCreamCone(4, "Strawberry", "Sugar");
		
		// Adding toppings
		chocolateIceCream.addToppings("Oreos");
		vanillaIceCream.addToppings("Sprinkles");
		strawberryIceCream.addToppings("Nuts");
		
		// Creating objects for memento design pattern
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();	// Used for chocolate ice cream
		CareTaker careTaker2 = new CareTaker();	// Used for vanilla ice cream
		CareTaker careTaker3 = new CareTaker();	// Used for Strawberry ice cream
		
		// Saving all states
		originator.setState(chocolateIceCream);
		careTaker.add(originator.saveStateToMemento());
		originator.setState(vanillaIceCream);
		careTaker2.add(originator.saveStateToMemento());
		originator.setState(strawberryIceCream);
		careTaker3.add(originator.saveStateToMemento());
		
		// Asking user for which cone they want
		System.out.println("Which cone do you want?");
		System.out.println("1. Chocolate\n2. Vanilla\n3. Strawberry");
	}
}