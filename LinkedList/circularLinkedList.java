package LinkedList;


public class circularLinkedList {
    public class Node{
    int data;
    Node next;
        Node(int data){
        this.data = data;
        this.next = null;
    }
    }
    public static Node head;
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            newNode.next = newNode;
            head = newNode;
        }
        while (temp != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }
    public void PrintLL(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
       do{
           System.out.print(temp.data+ " ");
           temp = temp.next;
        }while (temp != head);

    }

    public static void main(String[] args) {
        circularLinkedList cl = new circularLinkedList();
        cl.insertLast(25);
        cl.insertLast(31);
        cl.insertLast(65);
        cl.PrintLL();
        //neetcode
    }
}
