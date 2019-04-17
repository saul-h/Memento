import java.util.ArrayList;
public class Memento {
	
	private int numberOfScoops;
	private String flavor;
	private String typeOfCone;
	private ArrayList<String> toppings;
	
	public Memento(int numberOfScoops, String flavor, String typeOfCone, ArrayList<String> toppings) {
		this.numberOfScoops = numberOfScoops;
		this.flavor = flavor;
		this.typeOfCone = typeOfCone;
		this.toppings = toppings;
	}
	
	public int getNumberOfScoops() {
		return numberOfScoops;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public String typeOfCone() {
		return typeOfCone;
	}
	
	public ArrayList<String> getToppings() {
		return toppings;
	}
	
	@Override
	public String toString() {
		return String.format("State: %5d%10s%10s", numberOfScoops, flavor, typeOfCone);
	}
}
