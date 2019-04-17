/*
 * Abel Acosta
 * Saul Hernandez
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
		
		// TODO: Save Ice Creams
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState(chocolateIceCream);
		careTaker.add(originator.saveStateToMemento());
		
		// Changing Ice Cream states
		chocolateIceCream.setFlavor("Rocky road");
		chocolateIceCream.addToppings("M&ms");
		
		System.out.println(chocolateIceCream);
		
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println(originator.getState());
	}
}