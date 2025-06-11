package addon_DSA;
import java.util.Scanner;

public class Menu_driven_dll {
	
	

	
	    Node head;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int val) {
	            data = val;
	            next = null;
	            prev = null;
	        }
	    }

	    // Insert at the beginning
	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    // Insert at the end
	    public void insertAtEnd(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }

	    // Insert at a specific position (0-based)
	    public void insertAtPosition(int pos, int val) {
	        if (pos < 0) {
	            System.out.println("Position can't be negative");
	            return;
	        }

	        if (pos == 0) {
	            insertAtBegin(val);
	            return;
	        }

	        Node newNode = new Node(val);
	        Node temp = head;

	        for (int i = 0; i < pos - 1; i++) {
	            if (temp == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of bounds");
	            return;
	        }

	        newNode.next = temp.next;
	        newNode.prev = temp;
	        
	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }

	        temp.next = newNode;
	    }

	    // Delete at a specific position (0-based)
	    public void deleteAtPosition(int pos) {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        if (pos < 0) {
	            System.out.println("Position can't be negative");
	            return;
	        }

	        if (pos == 0) {
	            head = head.next;
	            if (head != null) {
	                head.prev = null;
	            }
	            return;
	        }

	        Node temp = head;
	        for (int i = 0; i < pos; i++) {
	            if (temp == null) {
	                System.out.println("Position out of bounds");
	                return;
	            }
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Position out of bounds");
	            return;
	        }

	        if (temp.prev != null) {
	            temp.prev.next = temp.next;
	        }

	        if (temp.next != null) {
	            temp.next.prev = temp.prev;
	        }
	    }

	    // Display from head to tail
	    public void display() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        menu_driven list = new menu_driven();
	        Scanner rk = new Scanner(System.in);
	        int choice = 0;

	        while (choice != 9) {
	            System.out.println("\n---- MENU ----");
	            System.out.println("1. Insert number at the start");
	            System.out.println("2. Insert number at the end");
	            System.out.println("3. Insert at any position");
	            System.out.println("4. Delete node at a position");
	            System.out.println("5. Display list");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");
	            choice = rk.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to insert at start: ");
	                    int valStart = rk.nextInt();
	                    list.insertAtBegin(valStart);
	                    break;
	                case 2:
	                    System.out.print("Enter value to insert at end: ");
	                    int valEnd = rk.nextInt();
	                    list.insertAtEnd(valEnd);
	                    break;
	                case 3:
	                    System.out.print("Enter position to insert: ");
	                    int pos = rk.nextInt();
	                    System.out.print("Enter value to insert: ");
	                    int valPos = rk.nextInt();
	                    list.insertAtPosition(pos, valPos);
	                    break;
	                case 4:
	                    System.out.print("Enter position to delete: ");
	                    int delPos = rk.nextInt();
	                    list.deleteAtPosition(delPos);
	                    break;
	                case 5:
	                    System.out.print("Linked list: ");
	                    list.display();
	                    break;
	                case 9:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	                    break;
	            }
	        }
	        rk.close();
	    }
	}


	

	
	   