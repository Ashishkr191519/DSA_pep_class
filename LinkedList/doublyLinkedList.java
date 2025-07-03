package LinkedList;

public class doublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    public static void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("Lineked List is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //temp.prev.next -> for deletion in Last Doubly Linked List

        public static void main(String[] args) {

        doublyLinkedList dl = new doublyLinkedList();
        dl.addLast(55);
        dl.addLast(56);
        dl.addLast(34);
        dl.printLL();
    }

}
