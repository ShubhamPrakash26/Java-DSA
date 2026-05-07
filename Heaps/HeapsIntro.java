package Heaps;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapsIntro {

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String n, int r){
            this.name = n;
            this.rank = r;
        }
        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(3);
        // pq.add(4);      // O(logn)
        // pq.add(1);
        // pq.add(7);
        // while(!pq.isEmpty()){
        //     System.out.print(pq.peek() + " ");      // O(1)
        //     pq.remove();                        //O(logn)
        // }

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());     
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 8));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);      
            pq.remove();                        
        }
    }
}
