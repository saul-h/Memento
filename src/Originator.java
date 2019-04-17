public class Originator {
	AdvancedIceCreamCone iceCream;
	
	public void setState(AdvancedIceCreamCone iceCream) {
		this.iceCream = iceCream;
	}
	
	public Memento saveStateToMemento(){
	      return new Memento(iceCream.getNumberOfScoops(), iceCream.getFlavor(), iceCream.getTypeOfCone(), iceCream.getToppings());
	}
}
