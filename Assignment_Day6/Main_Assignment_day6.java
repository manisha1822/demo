package addon_DSA;
import java.util.Scanner;


public class Main_Assignment_day6 {
	

	
	    
	    private int[] queue;
	    private int front, rear, size;

	   
	    public void QueueUsingPointers(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = -1;
	        rear = -1;
	    }

	   
	    public boolean isFull() {
	        return rear == size - 1;
	    }

	    
	    public boolean isEmpty() {
	        return front == -1 || front > rear;
	    }

	   
	    public void enqueue(int element) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue.");
	        } else {
	            if (front == -1) {
	                front = 0;  
	            }
	            rear++;
	            queue[rear] = element;
	            System.out.println("Enqueued " + element);
	        }
	    }

	   
	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	        } else {
	            System.out.println("Dequeued " + queue[front]);
	            front++;
	        }
	    }

	   
	    public void peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	        } else {
	            System.out.println("Front element: " + queue[front]);
	        }
	    }

	   
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	        } else {
	            System.out.print("Queue elements: ");
	            for (int i = front; i <= rear; i++) {
	                System.out.print(queue[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    
	    public static void displayMenu() {
	        System.out.println("\nQueue Operations Menu:");
	        System.out.println("1. Enqueue");
	        System.out.println("2. Dequeue");
	        System.out.println("3. Peek");
	        System.out.println("4. Check if Empty");
	        System.out.println("5. Display Queue");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the queue: ");
	        int size = sc.nextInt();
	        Main_Assignment_day6 queue = new Main_Assignment_day6();

	        while (true) {
	            displayMenu();
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1: 
	                    System.out.print("Enter the element to enqueue: ");
	                    int element = sc.nextInt();
	                    queue.enqueue(element);
	                    break;

	                case 2:  
	                    queue.dequeue();
	                    break;

	                case 3: 
	                    queue.peek();
	                    break;

	                case 4:  
	                    if (queue.isEmpty()) {
	                        System.out.println("Queue is empty.");
	                    } else {
	                        System.out.println("Queue is not empty.");
	                    }
	                    break;

	                case 5:  
	                    queue.display();
	                    break;

	                case 6:  
	                    System.out.println("Exiting the program...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
	}



