public class doublyLinkedList {
    private Node head;
    private Node tail;
    public int size;
    doublyLinkedList(){
        this.size = 0;
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val){
            this.val = val;
        }

        public Node (int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
// insert and first
    public void insertFirst(int val){
        Node node = new Node(val);
        if(size == 0){  // if (head == null)
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        
        size++;
    }
// insert at last
    public void insertLast(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    private Node getNode(int index){
        Node node = head;
        for(int i = 0; i< index; i++){
            node = node.next;
            if(node == null){
                return null;
            }
        }
        return node;
    }

    public void insert(int val, int index){
        if(getNode(index)== null){
            System.out.println("Does not exist! ")
        }
        if(index == 0){
            insertFirst(val);
        }
        
        else if(index == size -1){
            insertLast(val);
        }

        else{
            Node prevNode = getNode(index-1);
            Node nextNode = getNode(index);
            Node node = new Node(val, nextNode, prevNode);
            prevNode.next = node;
            nextNode.prev = node;
        }
        size ++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " <<>> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " <<>> ");
            temp = temp.prev;
        }
        System.out.println("End");
    }

    // function to delete first element
    public int deleteFirst(){
        int val;
        if(size == 1){
            val = head.val;
            head = null;
            tail = head;
        }
        else{
            val = head.val;
            head.next.prev = null;
            head = head.next;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        int val;
        if(size == 1){
            val = head.val;
            head = null;
            tail = head;
        }
        else{
            val = tail.val;
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        int val;
        if(size == 1){
            val = head.val;
            head = null;
            tail = head;
            size--;
        }
        else if(size == 2){
            if(index == 0){
                val = deleteFirst();
            }
            else{
                val = deleteLast();
            }
        }
        else{
            val = getNode(index).val;
            Node prevDel = getNode(index-1);
            Node nextDel = getNode(index+1);
            prevDel.next = nextDel;
            nextDel.prev = prevDel;
            size--;
        }
        
        return val;
    }

    public void sameValues(){
        Node node = head;
        int i = 0;
        while(i< size){
            node.val = 34;
            node = node.next;
            i++;
        }
    }
}
