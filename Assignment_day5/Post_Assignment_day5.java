package addon_DSA;
import java.util.Scanner;

public class Post_Assignment_day5 {
	
	
	    private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	    public Post_Assignment_day5 () {
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
	        System.out.println(data + " inserted at tail.");
	    }

	   
	    public void deleteAtHead() {
	        if (head == null) {
	            System.out.println("List is empty. No node to delete.");
	            return;
	        }
	        if (head.next == head) {
	            System.out.println("Deleted head node with value " + head.data);
	            head = null;
	            return;
	        }
	        Node last = head;
	        while (last.next != head)
	            last = last.next;
	        System.out.println("Deleted head node with value " + head.data);
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
	        System.out.println("Deleted node at position " + position + " with value " + current.data);
	    }

	    
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node current = head;
	        System.out.print("Circular Linked List: ");
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != head);
	        System.out.println("(back to head)");
	    }

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Post_Assignment_day5  cll = new Post_Assignment_day5 ();

	        while (true) {
	            System.out.println("\n--- Circular Linked List Menu ---");
	            System.out.println("1. Insert at tail");
	            System.out.println("2. Delete at head");
	            System.out.println("3. Delete at position");
	            System.out.println("4. Display list");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice (1-5): ");

	            int choice = -1;
	            try {
	                choice = Integer.parseInt(scanner.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number between 1 and 5.");
	                continue;
	            }

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert: ");
	                    try {
	                        int val = Integer.parseInt(scanner.nextLine());
	                        cll.insertAtTail(val);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid value. Please enter an integer.");
	                    }
	                    break;
	                case 2:
	                    cll.deleteAtHead();
	                    break;
	                case 3:
	                    System.out.print("Enter position to delete: ");
	                    try {
	                        int pos = Integer.parseInt(scanner.nextLine());
	                        cll.deleteAtPosition(pos);
	                    } catch (NumberFormatException e) {
	                        System.out.println("Invalid position. Please enter an integer.");
	                    }
	                    break;
	                case 4:
	                    cll.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting program. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please select 1-5.");
	            }
	        }
	    }
	}




