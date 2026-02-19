import java.util.Deque;
import java.util.LinkedList;
public class StackQueueUsingDeque {
    public static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        public boolean isEmpty(){
            if(deque.isEmpty()){
                return true;
            }
            return false;
        }
        public  void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public boolean isEmpty(){
            return deque.isEmpty();
        }
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek element: " + s.peek());
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek element: " + q.peek());
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
