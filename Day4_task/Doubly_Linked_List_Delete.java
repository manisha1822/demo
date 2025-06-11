package addon_DSA;

public class Doubly_Linked_List_Delete {
    
   
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

    public Doubly_Linked_List_Delete() {
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

    
    public void deleteMiddle() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
           
            head = null;
            tail = null;
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        if (slow.prev != null) {
            slow.prev.next = slow.next;
        } else {
            
            head = slow.next;
        }

        if (slow.next != null) {
            slow.next.prev = slow.prev;
        } else {
          
            tail = slow.prev;
        }
    }

   
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        Doubly_Linked_List_Delete list = new Doubly_Linked_List_Delete();

       
        list.insertMiddle(1);
        list.insertMiddle(2);
        list.insertMiddle(3);
        list.insertMiddle(4);
        list.insertMiddle(5);

        System.out.println("List before deleting middle node:");
        list.printList(); 
        
        list.deleteMiddle();

        System.out.println("\nList after deleting middle node:");
        list.printList();
    }
}
