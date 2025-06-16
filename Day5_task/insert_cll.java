package addon_DSA;

public class insert_cll {
	
	    
	    private static class Node {
	        int data;
	        Node next;
	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    
	    private Node head;
	    
	    public insert_cll() {
	        head = null;
	    }
	    
	   
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head; 
	        } else {
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
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != head);
	        System.out.println("(back to head)");
	    }
	    
	  
	    public static void main(String[] args) {
	    	insert_cll cll = new insert_cll();
	        
	        cll.insertAtTail(5);
	        cll.insertAtTail(15);
	        cll.insertAtTail(25);
	        cll.insertAtTail(35);
	        
	        cll.display();
	    }
	}




