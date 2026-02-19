import java.util.LinkedList;
public class LinkedListJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.add(3,3 );
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);
        System.out.println(ll);
    }
}
