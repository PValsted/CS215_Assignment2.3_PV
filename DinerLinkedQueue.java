/**
 * Custom queue designed for storing customers of a diner. Uses a generic linked list 
 * and generic node class to employ these methods.
 * @author Patrick Valsted
 *
 */
public class DinerLinkedQueue {

	GenericLinkedList tempList = new GenericLinkedList();
	GenericNode<Customer> node, head, tail;
	Customer customer;
	int length;
	
	/**
	 * The constructor creates the linked list and stores it as tempList as well as setting the length to 0
	 * and the head and tail to null.
	 */
	public DinerLinkedQueue() {
		GenericLinkedList tempList = new GenericLinkedList();
		length=0;
		head=tail=null;
	}//end empty-argument constructor
	
	/**
	 * This method enqueues the inputed customer.
	 * If this is the first entry, it sets the data to be stored in the head node.
	 * Otherwise, it adds the node at the end of the queue. This method also prints the
	 * customer's name and that they have arrived as well as the entire queue.
	 * @param customer
	 */
	public void enqueue(Customer customer) {
		GenericNode<Customer> node=new GenericNode<Customer>();
		
		if (tempList.isEmpty()) { //only runs if the queue is empty
			node.setData(customer);
			tempList.addNode(node);
			head=node; //stores this entry as first in the queue
			System.out.println(customer.getName()+" has arrived!");
			System.out.println("Current Queue:");
			this.printQueue();
			System.out.println();
		}//end if
		
		else { //runs if there is at least one entry in the queue
			node.setData(customer);
			tempList.addNode(node);
			tail.setNextNode(node); //
			System.out.println(customer.getName()+" has arrived!");
			System.out.println("Current Queue:");
			this.printQueue();
			System.out.println();
		}//end else
		
		tail=node; //stores this entry as the customer at the end of the queue
		length++; //increments length of queue
	}//end enqueue
	
	/**
	 * This method dequeues the first customer in the queue.
	 * It also prints the customer's name, what they ordered, and the entire queue.
	 * @return customer removed
	 */
	public Customer dequeue() {
		Customer tempCustomer=head.getData(); //stores the customer data to be used later
		head=head.getNextNode(); //switches the head to the next node in the queue
		
		System.out.println(tempCustomer.name+" has been served "+tempCustomer.order+"."); //prints customer's name and order
		System.out.println("Current Queue:");
		this.printQueue();
		System.out.println();
		
		length--; //decrements the queue length
		
		return tempCustomer;
	}//end dequeue
	
	/**
	 * Method added to print out the entire linked queue.
	 * This method uses a while loop to print the data of the node at the head and then move
	 * onto the next node until it reaches an empty node.
	 */
	public void printQueue() {
		GenericNode tempNode=head; //stores the head in a temp variable
		
		while (tempNode != null) { //while the head is not empty, the loop will run
			System.out.println(tempNode.getData()); 
			tempNode=tempNode.getNextNode(); //moves on to the next node and the loop repeats until the very end of the queue
		}//end while loop
		
	}//end printQueue

	/**
	 * Returns the length of the queue
	 * @return length of queue
	 */
	public int getLength() {
		return length;
	}//end getLength
	
}//end class
