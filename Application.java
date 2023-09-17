/**
 * Driver class for the DinerLinkedQueue.
 * @author Patrick Valsted
 *
 */
public class Application {

	public static void main(String[] args) {
		
		DinerLinkedQueue lq = new DinerLinkedQueue();
		Customer bill=new Customer("Bill","Impossible Burger plain w/ fries");
		Customer alice=new Customer("Alice","BBQ Impossible Burger w/ potato salad");
		Customer bob=new Customer("Bob","Garden Burger no tomato w/ fries");
		Customer jane=new Customer("Jane","Impossible Burger no ketchup or onion w/ tater tots");
		Customer hamad=new Customer("Hamad","Impossible Bratwurst w/ side salad");
		Customer jim=new Customer("Jim","Caesar Salad w/ no side");
		
		
		lq.enqueue(bill); //bill arrives
		lq.enqueue(alice); //alice arrives
		lq.enqueue(bob); //bob arrives
		
		lq.dequeue(); //bill leaves
		
		lq.enqueue(jane); //jane arrives
		lq.enqueue(hamad); //hamad arrives
		
		System.out.println(lq.getLength()+"\n"); //testing getLength method
		
		lq.dequeue(); //alice leaves
		lq.dequeue(); //bob leaves
		
		lq.enqueue(jim); //jim arrives
		
		System.out.println(lq.getLength()+"\n"); //testing getLength method
		
		lq.dequeue(); //jane leaves
		lq.dequeue(); //hamad leaves
		
	}//end main

}//end class
