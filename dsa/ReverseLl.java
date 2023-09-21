class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next = null;
    }
}

class Reverse {
    Node head;

    public Reverse(){
        this.head = null;
    }

    public void Append(int data){
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node nextNode;

        while(current != null){
           nextNode = current.next;
           current.next = prev;
           prev = current;
           current = nextNode;
        }
        head = prev;
    }

    public void display(){
        Node current = head;
        System.out.println("Linked List ");
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class ReverseLl {
    public static void main(String[] args) {
        
        Reverse reverse = new Reverse();

        reverse.Append(11);
        reverse.Append(12);
        reverse.Append(17);
        reverse.Append(10);
        
        reverse.display();
        reverse.reverse();
        reverse.display();
        
    }
}