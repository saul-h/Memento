import java.util.Scanner;

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
		
		// Changing ice creams so they can be restored later
		chocolateIceCream.addScoop();
		chocolateIceCream.addToppings("Banana");
		vanillaIceCream.setFlavor("Rocky Road");
		strawberryIceCream.addScoop();
		strawberryIceCream.setTypeOfCone("Cup");
		
		// Asking user for which cone they want
		System.out.println("Which cone do you want? (1-3)");
		System.out.println("1. Chocolate\n2. Vanilla\n3. Strawberry");
		
		Scanner input = new Scanner(System.in);
		int index = 1;
		boolean valid = false;
		
		while(!valid) {
			try {
				index = Integer.parseInt(input.nextLine());
				if(index < 1 || index > 3) {
					throw new Exception();
				}
				valid = true;
			}catch(Exception e) {
				System.out.println("Enter a valid number (1-3)");
			}
		}
		
		
		if(index == 1) {
			System.out.println("Restoring chocolate...");
			originator.getStateFromMemento(careTaker.get(0));
			System.out.println(originator.getState());
		}else if(index == 2) {
			System.out.println("Restroing vanilla...");
			originator.getStateFromMemento(careTaker2.get(0));
			System.out.println(originator.getState());
		}else {
			System.out.println("Restoring strawberry...");
			originator.getStateFromMemento(careTaker3.get(0));
			System.out.println(originator.getState());
		}
	}
}