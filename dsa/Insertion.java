class Node {
    int data;
    Node next;

    public Node(int data){
        this.next = null;
        this.data = data;
    }
}

class InsertionAtPos {
    Node head;

    public InsertionAtPos(){
        this.head=null;
    }

    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertInMiddle(int position, int data){
        if(position <= 0){
            System.out.println("Invalid Positiont: ");
            return;
        }
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        for(int i = 1; i<position-1 && currentNode != null; i++){
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
        public void deletee(int value){
            if(head == null){
                return;
            }
            if(head.data == value){
                head = head.next;
                return;
            }
            Node current = head;
            while(current.next != null){
                if(current.next.data == value){
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
} 

public class Insertion {
    public static void main(String[] args) {
        InsertionAtPos insert = new InsertionAtPos();

        insert.insertAtBeg(20);
        insert.insertAtBeg(19);

        insert.insertAtBeg(12);
        insert.insertInMiddle(2, 11);
        insert.insertAtEnd(16);
        insert.insertInMiddle(2, 14);
        insert.deletee(13);

        insert.display();
    }
}