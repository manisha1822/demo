package addon_DSA;


	import java.util.Stack;
	import java.util.Scanner;
	public class Menu_Stack {

	

	    
	    public static void displayMenu() {
	        System.out.println("Stack Operations Menu:");
	        System.out.println("1. Push");
	        System.out.println("2. Pop");
	        System.out.println("3. Peek");
	        System.out.println("4. Check if Empty");
	        System.out.println("5. Display Stack");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	    }

	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        Scanner sc = new Scanner(System.in);
	        
	        while (true) {
	            displayMenu(); 
	            int choice = sc.nextInt();  

	            switch (choice) {
	                case 1:  
	                    System.out.print("Enter the element to push: ");
	                    int elementToPush = sc.nextInt();
	                    stack.push(elementToPush);
	                    System.out.println("Element " + elementToPush + " pushed to the stack.");
	                    break;
	                
	                case 2:  
	                    if (stack.isEmpty()) {
	                        System.out.println("Stack is empty, cannot pop.");
	                    } else {
	                        int poppedElement = stack.pop();
	                        System.out.println("Popped element: " + poppedElement);
	                    }
	                    break;
	                
	                case 3:  
	                    if (stack.isEmpty()) {
	                        System.out.println("Stack is empty.");
	                    } else {
	                        int topElement = stack.peek();
	                        System.out.println("Top element: " + topElement);
	                    }
	                    break;
	                
	                case 4: 
	                    if (stack.isEmpty()) {
	                        System.out.println("Stack is empty.");
	                    } else {
	                        System.out.println("Stack is not empty.");
	                    }
	                    break;
	                
	                case 5: 
	                    if (stack.isEmpty()) {
	                        System.out.println("Stack is empty.");
	                    } else {
	                        System.out.println("Stack contents: " + stack);
	                    }
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



