class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SinglyLL{
    Node head;

    public SinglyLL(){
        this.head=null;
    }

    public void Append(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void delete(int value){
        if(head == null)
            return;
        
        if(head.data == value){
            head = head.next;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data == value){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }
    
    public void display() {
        Node currentNode = head;
        System.out.println("Linked List: ");
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

public class SingleLL {
    public static void main(String[] args) {
        SinglyLL SLL = new SinglyLL();

        SLL.Append(5);
        SLL.Append(3);
        SLL.Append(4);
        SLL.Append(7);
        SLL.delete(4);

       
        SLL.display();
    }
}