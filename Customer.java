
/**
 * Very simple class designed to serve as an object functioning as a restaurant customer
 * @author Patrick Valsted
 *
 */

public class Customer {

	String name, order;

	/**
	 * Empty-argument constructor sets the two variables to be empty
	 */
	public Customer() {
		name="";
		order="";
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor lets user pass in name and order
	 * @param name of customer
	 * @param order of customer
	 */
	public Customer(String name, String order) {
		this.name=name;
		this.order=order;
	}//end preferred constructor

	/**
	 * Returns the name of the customer
	 * @return name of customer
	 */
	public String getName() {
		return name;
	}//end getName

	/**
	 * Sets the name of the customer
	 * @param name of customer
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**
	 * Returns the customer's order
	 * @return order of customer
	 */
	public String getOrder() {
		return order;
	}//end getOrder

	/**
	 * Sets the customer's order
	 * @param order of customer
	 */
	public void setOrder(String order) {
		this.order = order;
	}//end setOrder

	/**
	 * Returns information about the customer, including the value of all variables
	 * @return Formatted String listing of customer variables
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", order=" + order + "]";
	}//end toString
	
}//end class
