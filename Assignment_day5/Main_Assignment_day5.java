package addon_DSA;

public class Main_Assignment_day5 {
	
	    private static class Node {
	        int data;
	        Node next;
	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    
	    private Node head;
	    
	    public  Main_Assignment_day5() {
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
	    
	    
	    private void deleteAtHead() {
	        if (head == null) {
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
	    
	   
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty. No nodes to delete.");
	            return;
	        }
	        if (position <= 0) {
	            System.out.println("Invalid position. Position must be >= 1.");
	            return;
	        }
	        
	        
	        if (position == 1) {
	            deleteAtHead();
	            return;
	        }
	        
	        Node current = head;
	        Node prev = null;
	        int count = 1;
	        
	       
	        while (count < position && current.next != head) {
	            prev = current;
	            current = current.next;
	            count++;
	        }
	        
	        if (count != position) {
	          
	            System.out.println("Position " + position + " does not exist in the list.");
	            return;
	        }
	        
	        
	        prev.next = current.next;
	        
	    }
	    
	   
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node cur = head;
	        do {
	            System.out.print(cur.data + " -> ");
	            cur = cur.next;
	        } while (cur != head);
	        System.out.println("(back to head)");
	    }
	    
	   
	    public static void main(String[] args) {
	    	 Main_Assignment_day5 cll = new  Main_Assignment_day5();
	        
	        cll.insertAtTail(10);
	        cll.insertAtTail(20);
	        cll.insertAtTail(30);
	        cll.insertAtTail(40);
	        cll.insertAtTail(50);
	        
	        System.out.println("Original List:");
	        cll.display();
	        
	        System.out.println("Delete at position 1 (head):");
	        cll.deleteAtPosition(1);
	        cll.display();
	        
	        System.out.println("Delete at position 3:");
	        cll.deleteAtPosition(3);
	        cll.display();
	        
	        System.out.println("Delete at position 10 (invalid):");
	        cll.deleteAtPosition(10);
	        cll.display();
	        
	        System.out.println("Delete at position 2:");
	        cll.deleteAtPosition(2);
	        cll.display();
	    }
	}



