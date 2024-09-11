public class DLL {

    public Node head;
    public Node tail;
    public int size;
    public static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
          head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = null;
            head.prev = null;
            size++;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            node.next = null;
            size++;
        }

    }

    public void insert(int val, int index){
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;



    }
    public Node find(int val){
        Node temp = head;
        while(temp.value != val){
            temp = temp.next;
        }
        return temp;
    }
    public void afterGivenNode(int after, int val){
        Node node = find(after);
        Node nNode = new Node(val);
        nNode.next = node.next;
        node.next = nNode;
        nNode.prev = node;
        node.next.next.prev = nNode;
        size++;
    }



    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("print in reverse ");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;

        }
        System.out.println("START");
    }





    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(50);
        list.insertLast(75);
        list.insertLast(100);
        list.insert(125, 4);
        list.afterGivenNode(5, 99);
        list.display();
    }
}
