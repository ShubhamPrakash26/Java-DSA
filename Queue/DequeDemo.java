import java.util.*;
import java.util.LinkedList;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deqeue = new LinkedList<>();
        deqeue.addFirst(1);
        deqeue.addFirst(2);
        deqeue.addLast(3);
        deqeue.addLast(4);
        deqeue.removeLast();
        System.out.println(deqeue);
        System.out.println(deqeue.getFirst());
        System.out.println(deqeue.getLast());
    }   
}
