package addon_DSA;

public class DoublyLinkedList {
	 class Node {
	        int data;
	        Node next;
	        Node prev;

	        public Node(int data) {
	            this.data = data;
	        }
	    }

	   
	    Node head;
	    Node tail;

	   
	    public DoublyLinkedList() {
	        head = null;
	        tail = null;
	    }

	   
	    public void insertMiddle(int data) {
	        Node newNode = new Node(data);

	      
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            return;
	        }

	        
	        Node slow = head;
	        Node fast = head;

	      
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	       
	        newNode.next = slow.next;
	        newNode.prev = slow;

	        
	        if (slow.next != null) {
	            slow.next.prev = newNode;
	        } else {
	            
	            tail = newNode;
	        }

	        
	        slow.next = newNode;
	    }

	   
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data  );
	            current = current.next;
	        }
	        System.out.println();
	    }

	    
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        
	        list.insertMiddle(1);
	        list.insertMiddle(2); 
	        list.insertMiddle(3); 
	        list.insertMiddle(4); 
	        
	        System.out.println("List before inserting middle node:");
	        list.printList(); 

	        list.insertMiddle(5);
	        System.out.println("\nList after inserting middle node:");
	        list.printList(); 
	    }
	}


