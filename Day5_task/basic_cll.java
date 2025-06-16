package addon_DSA;

public class basic_cll {
	
	    Node head;

	   
	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    
	    public void insert(int val) {
	        Node newNode = new Node(val);

	        
	        if (head == null) {
	            head = newNode;
	            newNode.next = head; 
	        }
	      
	        else {
	            Node current = head;

	           
	            while (current.next != head) {
	                current = current.next;
	            }

	          
	            current.next = newNode;
	            newNode.next = head;
	        }
	    }

	   
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node current = head;

	        
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head); 

	        System.out.println();
	    }

	   
	    public static void main(String[] args) {
	        basic_cll list = new basic_cll();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);
	        list.insert(50);
	        
	        System.out.println("Circular Linked List after inserting at the end:");
	        list.display();
	    }
	}



