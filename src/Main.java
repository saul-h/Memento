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
		strawberryIceCream.addToppings("Sprinkles");
		strawberryIceCream.addToppings("Nuts");
		
		
	}
}