public class LL {
    public Node head;
    public Node tail;
    public int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;

        for(int i=1; i<index; i++){
            System.out.println(temp.value + " --> ");
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    public void deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;
        System.out.println("Deleted -> " +val);
    }
    public Node getIndex(int index){
        Node node = head;
        System.out.println("Head = "+node);
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        else if(index == size-1){
            System.out.println(deleteEnd());
        }
        else{
            Node prev = getIndex(index - 1);

            int val = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return val;
        }
       return -1;
    }

    public int deleteEnd(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    public Node findNode(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
           node = node.next;
        }
        return null;
    }


    public void insertRec(int val, int index){
       head = insertRec(head, val, index);
    }
    public Node insertRec(Node head, int val, int index){
        index = index - 1;
        if(index == 0){
            Node node = new Node(val);
            node.next = head.next;
            head.next = node;
            return head;

        }

        insertRec(head.next, val, index);
        return head;


    }

    public Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }



    public void display(){
//        Node temp = reverse(head);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> " );
            temp = temp.next;
        }
        System.out.println("END");
    }
    static class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
//            this.next = null;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }
    }

    public static void main(String[] args) {
            LL list = new LL();
//            list.insertFirst(3);
//            list.insertFirst(2);
//            list.insertFirst(8);
//            list.insertFirst(17);
            list.insertLast(20);
            list.insertLast(50);
            list.insertLast(70);
            list.insertLast(100);
//        System.out.println(list.getIndex(3));
//            list.insert(500, 3);
//            list.deleteFirst();
            list.findNode(100);
            list.display();
//            System.out.println("deleted : " +list.deleteEnd());
//            list.display();
//            System.out.println("deleted : " +list.deleteEnd());
//            list.display();
//            System.out.println("deleted : " +list.deleteEnd());

//            System.out.println(list.delete(0));

//              list.insertRec(500, 1);
//              list.display();

//              list.display();


    }
}


