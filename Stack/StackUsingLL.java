class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLL {
    Node top;
    public StackUsingLL(){
        this.top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
        }
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int head = top.data;
        top = top.next;
        return head;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }


    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
