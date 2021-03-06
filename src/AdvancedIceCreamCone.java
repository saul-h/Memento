/*
 * Abel Acosta
 * Saul Hernandez
 * Purpose: This program demonstrates the memento design pattern with ice creams.
 * Input: Choose ice cream from system input.
 * Output: Prints ice cream information in system output. 
 */

/**
 * This class is used to model the properties and behaviors of an ice cream cone.
 * There are currently restriction on the construction of the cone: only one
 * flavor of ice cream is allowed.
 */
import java.util.*;
public class AdvancedIceCreamCone {
	/**
	 * Holds number of scoops
	 */
	private int numberOfScoops;
	/**
	 * Holds flavor type
	 */
	private String flavor;
	/**
	 * Holds type of cone
	 */
	private String typeOfCone;
	/**
	 * Holds list of all toppings on ice cream
	 */
	private ArrayList<String> toppings = new ArrayList<String>();


	/**
	 * the default constructor creates a one scoop, vanilla ice cream cone using the regular type of cone and no toppings
	 */
	public AdvancedIceCreamCone() {
		numberOfScoops=1;
		flavor="vanilla";
		typeOfCone="regular";
	}
/*this constructor lets you create an ice cream code to your liking. It takes in three parameters:
  the number of scoops, the flavor of the ice cream and the type of cone */
	public AdvancedIceCreamCone(int ns,String flv,String cone) {
		numberOfScoops=ns;
		flavor=flv;
		typeOfCone=cone;
	}
//this method returns the number of scoops in the cone
	public int getNumberOfScoops () {
		return numberOfScoops;
	}
/**
 * this method returns the ice cream flavor
 * @return flavor type of cone
 */
	public String getFlavor() {
		return flavor;
	}
/**
 * this method returns the type of cone
 * @return type of cone
 */
	public String getTypeOfCone() {
		return typeOfCone;
	}
/**
 * this method allows you to add one scoop of ice cream at a time
 */
	public void addScoop() {
		numberOfScoops=numberOfScoops+1;
	}
/**
 * this method allows you to change the ice cream flavor
 * @param flv flavor you want to set
 */
	public void setFlavor(String flv) {
			flavor=flv;
	}
/**
 * this method allows you to change the type of cone
 * @param cone cone you want to set
 */
	public void setTypeOfCone(String cone) {
		typeOfCone=cone;
	}
/**
 * this method allows you to add  toppings
 * @param top topping you want to add
 */
    public void addToppings(String top) {
		  toppings.add(top);
	}

/**
 * this method returns a String with a list of the toppings
 * @return List of toppings
 */
	public ArrayList<String> getToppings () {
		return toppings;
	}

/**
 * this method overrides the inherited toString()
 */
	public String toString() {
		return ("The number of scoops is " + numberOfScoops + ". The flavor is " +
		  flavor + ". And the type of cone is " + typeOfCone + " and the toppings are: " + getToppings());
	  }

}