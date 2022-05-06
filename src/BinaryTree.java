import java.util.Scanner;

// declaring the node
class Node{
    int value;
    Node left, right;
    public Node(int item){
        this.value = item;
    }

    public Node(int item, Node left, Node right){
        this.value = item;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree{
    public static void main(String[] args) {
        Node root = BinaryTree.createTree();
        System.out.print("InOrder traversal - ");
        inOrder(root);
        System.out.println();
        System.out.print("PreOrder traversal - ");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder traversal - ");
        postOrder(root);
    }


    Node root;
    // constructor for nothing entered as parameter
    BinaryTree(){
        root = null;
    }
    // constructor for something entered as parameter
    BinaryTree(int key){
        root = new Node(key);
    }
    static Scanner scan = new Scanner(System.in);
    static Node createTree(){
        System.out.print("Enter data: ");
        int data = scan.nextInt();
        if(data == -1){
            return null;
        }

        Node root = new Node(data);
        System.out.println("What must be left to " + root.value + " : ");
        root.left = createTree();

        System.out.println("What must be right to " + root.value + " : ");
        root.right = createTree();

        return root;
    }


// inOrder traversal
    static void inOrder(Node root){  //LNR
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }
// preOrder traversal
    static void preOrder(Node root){  //NLR
        if(root == null){
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
// postOrder traversal
    static void postOrder(Node root){  //LRN
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}