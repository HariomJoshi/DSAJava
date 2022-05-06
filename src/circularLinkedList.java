public class circularLinkedList {
    private Node head;
    private Node tail;
    public int size;
    circularLinkedList(){
        this.size = 0;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value= value;
        } 
        public Node(int value, Node next){
            this.value= value;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            tail = node;
            
        }else{
            tail.next = node;
            tail = node;
        }
        tail.next = head;
        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node node = head;
        for(int i = 0; i< size; i++){
            System.out.print(node.value + " -> ");
            node = node.next;
        }

        System.out.println("again to " +head.value  );
    }

    public void delete(int val){
        Node node = head;
        if(head == null){
            System.out.println("Empty list");
        }else{
            if(node.value == val){
                head = head.next;
                tail.next = head;
                size--;
                return;
            }
            while(node.next.value != val){
                if(node.next == tail){
                    System.out.println("Element not found");
                    return;
                }
                node = node.next;
            }
            // making connection with the node after the next node
            node.next = node.next.next;
            size--;
            
        }
    }

    
}
