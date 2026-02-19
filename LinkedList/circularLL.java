public class circularLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node last;
    public static int size;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = last = newNode;
            newNode.next = newNode;
        }
        newNode.next = head;
        last.next = newNode; 
        head = newNode;      
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = last = newNode;
            newNode.next = newNode;
        }
        last.next = newNode;
        newNode.next = head;
        last = newNode;
        size++;
    }
    public void addMiddle(int data, int pos){
        if(pos==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int count = 0; 
        Node curr = head;
        while(curr!=null && count<pos-1){
            curr=curr.next;
            count++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //remove
    public void removeFirst(){
        if(head==null){
            System.out.println("Circular Linked List is Empty");
            return;
        }
        if(head.next==head){
            head = last = null;
        }
        head = head.next;
        last.next = head;
        size--;
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("Circular Linked List is Empty");
            return;
        }
        if (head.next == head) {
            head = last = null;
        }
        Node temp = head;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = head;
        last = temp;
        size--;
    }
    public void print(){
        if(head==null){
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp!=head);
        System.out.println("null");
    }
    public static void main(String[] args) {
        circularLL ll = new circularLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addMiddle(10, 3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
