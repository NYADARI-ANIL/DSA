class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BTExample {
    Node root;

    public BTExample(){
        this.root = null;
    }

    public void insert(int data){
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data){
        if( root == null){
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if(data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    public void inorderTraversal(){
        inorderTraversal(root);
    }
    public void inorderTraversal (Node node) {
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data){
        if(root == null){
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        }
        return searchRec(root.right, data);
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        
        BTExample tree = new BTExample();

        tree.insert(50);
        tree.insert(20);
        tree.insert(10);
        tree.insert(25);
        tree.insert(60);
        tree.insert(70);
        tree.insert(40);

        System.out.println("In order traversal");
        tree.inorderTraversal();
        
        int searchValue = 43;
        if(tree.search(searchValue)) {
            System.out.println("\n" + searchValue + " found in the tree.");
        } else {
            System.out.println("\n" + searchValue + " not found in the tree.");
        }
    }
}