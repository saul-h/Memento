public class Memento {
	
	private int numberOfScoops;
	private String flavor;
	private String typeOfCone;
	
	public Memento(int numberOfScoops, String flavor, String typeOfCone) {
		this.numberOfScoops = numberOfScoops;
		this.flavor = flavor;
		this.typeOfCone = typeOfCone;
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
	
	@Override
	public String toString() {
		return String.format("State: %5d%10s%10s", numberOfScoops, flavor, typeOfCone);
	}
}
