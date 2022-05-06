public class singlyLinkedList {
    // variables of linked list
    public int size;
    private Node head;
    private Node tail;
    public singlyLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        // constructor 1
        public Node(int value){
            this.value = value;
        }

        // constructor 2
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;  // since an elements is increased to the size must be incremented
    }

    public void insert(int val, int index){
        Node temp = head;
        int i = 0;
        while(i != index-1){
            temp = temp.next;
            i++;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            tail = node;
            head = tail;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        // we've reached the end
        System.out.println("END");
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
            
        }
        size --;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i< index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size --;
        return val;
        // the left out node will be removed by garbage collector later on
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        Node indexNode = get(index-1);
        int val = indexNode.next.value;
        indexNode.next = indexNode.next.next;
        size--;
        return val;

    }
}


