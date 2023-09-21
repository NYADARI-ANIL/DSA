class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Dll {
    Node head;
    Node tail;

    public Dll(){
        this.head = null;
        this.tail = null;
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void displyForward() {
        Node current = head;
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        Dll dll = new Dll();

        dll.append(11);
        dll.append(12);
        dll.append(13);
        dll.append(14);

        System.out.println("Forward traversal: ");
        dll.displyForward();

        System.out.println("Backward traversal: ");
        dll.displayBackward();
    }
}