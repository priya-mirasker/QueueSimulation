package com.queues;

/*Program to simulate queue of integers using arrays.  
 * @author Priya Mirasker(priya.mirasker@gmail.com)
 * */

public class queueSimulation {
	private static final int length = 3;
	int queue[] = new int[length];
	int size = 0, top = -1, bottom = 0;
	 
	/* Method to push/add element into the queue 
	 * @param element - integer to be pushed into the queue array 
	 * @return void  
	 */
	public void push(int element) {
		if (top < length - 1) {
			top++;
			queue[top] = element;
			System.out.println("Element " + element + " is pushed to Queue!");
			display();
		} else {
			System.out.println("Queue limit exceeded!");
		}
	}
	
	/* Method to pop/remove element from of the queue 
	 * @return void  
	 */
	public void pop() {
		if (top >= bottom) {
			bottom++;
			System.out.println("Element is popped from queue!");
			display();
		} else {
			System.out.println("No more items in the queue!");
		}
	}
	/* Method to display all elements in the queue 
	 * @return void  
	 */
	public void display() {
		if (top >= bottom) {
			System.out.println("Elements in Queue: ");
			for (int i = bottom; i <= top; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	/* Main method to simulate the queue functions 
	 * @return void  
	 */
	 public static void main(String[] args) {
	  queueSimulation queueSim = new queueSimulation();
	  queueSim.pop();
	  queueSim.push(5);
	  queueSim.push(27);
	  queueSim.push(56);
	  queueSim.push(11);
	  queueSim.pop();
	  queueSim.pop();
	  queueSim.pop();
	  queueSim.pop();
	 }

}
