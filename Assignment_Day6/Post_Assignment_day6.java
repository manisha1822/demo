package addon_DSA;


	

	public class Post_Assignment_day6 {
	    class Stack {
	        private static class Node {
	            int data;
	            Node next;

	            Node(int data) {
	                this.data = data;
	                this.next = null;
	            }
	        }

	        private Node top;

	        public Stack() {
	            top = null;
	        }

	        public void push(int value) {
	            Node newNode = new Node(value);
	            newNode.next = top;
	            top = newNode;
	            System.out.println("Pushed " + value);
	        }

	        public int pop() {
	            if (top == null) {
	                System.out.println("Stack is empty");
	                return -1;
	            }
	            int poppedValue = top.data;
	            top = top.next;
	            return poppedValue;
	        }

	        public int peek() {
	            if (top == null) {
	                System.out.println("Stack is empty");
	                return -1;
	            }
	            return top.data;
	        }

	        public boolean isEmpty() {
	            return top == null;
	        }

	        public void display() {
	            if (top == null) {
	                System.out.println("Stack is empty");
	                return;
	            }
	            Node current = top;
	            System.out.print("Stack elements: ");
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Post_Assignment_day6 outerClass = new Post_Assignment_day6();
	        Stack stack = outerClass.new Stack(); 

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        stack.display();

	        System.out.println("Top element: " + stack.peek());

	        System.out.println("Popped element: " + stack.pop());
	        stack.display();

	        System.out.println("Top element after pop: " + stack.peek());
	    }
	}


	

	