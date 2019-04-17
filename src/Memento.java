import java.util.ArrayList;
public class Memento {
	
	private AdvancedIceCreamCone iceCream;
	
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
	
	public AdvancedIceCreamCone getState() {
		return iceCream;
	}
	
	@Override
	public String toString() {
		return String.format(	"State: %5d%10s%10s", 
								iceCream.getNumberOfScoops(), 
								iceCream.getFlavor(), 
								iceCream.getTypeOfCone());
	}
}
