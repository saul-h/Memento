public class Originator {
	
	AdvancedIceCreamCone iceCream;
	
	public void setState(AdvancedIceCreamCone iceCream) {
		this.iceCream = iceCream;
	}
	
	public AdvancedIceCreamCone getState() {
		return iceCream;
	}
	
	public Memento saveStateToMemento(){
	      return new Memento(iceCream);
	}
	
	public void getStateFromMemento(Memento m) {
		this.iceCream = m.getState();
	}
}
