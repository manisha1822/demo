package addon_DSA;

public class delete_cll {
	
	    private static class Node {
	        int data;
	        Node next;
	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    
	    private Node head;
	    
	    public delete_cll() {
	        head = null;
	    }
	    
	    
	    public void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else {
	            Node current = head;
	            while (current.next != head)
	                current = current.next;
	            current.next = newNode;
	            newNode.next = head;
	        }
	    }
	    
	    
	    public void deleteAtHead() {
	        if (head == null) {
	            System.out.println("List is empty. No node to delete.");
	            return;
	        }
	        
	       
	        if (head.next == head) {
	            head = null;
	            return;
	        }
	        
	        
	        Node last = head;
	        while (last.next != head)
	            last = last.next;
	        
	        head = head.next; 
	        last.next = head; 
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
	    	delete_cll cll = new delete_cll();
	        
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);
	        
	        System.out.println("Original list:");
	        cll.display();
	        
	        cll.deleteAtHead();
	        System.out.println("After deleting head:");
	        cll.display();
	        
	        cll.deleteAtHead();
	        System.out.println("After deleting head again:");
	        cll.display();
	        
	        
	        cll.deleteAtHead();
	        cll.deleteAtHead();
	        System.out.println("After deleting all nodes:");
	        cll.display();
	        
	       
	        cll.deleteAtHead();
	    }
	}



