package Heaps;
import java.util.*;
public class HeapImplementation {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;   // x is child index
            int par = (x-1)/2;      // par index
            while(arr.get(x)<arr.get(par)){         //Change sign for maxheap
                //Swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, temp);
                x = par;    // x is now parent index
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minIdx = idx;
            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){       //Change size for maxheap
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){     //change sign for maxHeap
                minIdx = right;
            }
            if(minIdx!=idx){
                int temp = arr.get(minIdx);
                arr.set(minIdx,arr.get(idx));
                arr.set(idx, temp);
                heapify(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // Step 1: Swap first and Last 
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            // Step 2 - Delete Last 
            arr.remove(arr.size()-1);

            //Step 3: Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx!=i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
            heapify(arr, maxIdx, size);
        }
    }
    public static void HeapSort(int arr[]){
        //build maxHeap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr, i,n);
        }
        //Step 2: Push largest at end
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0,i);
        }
    }
    public static void main(String[] args) {
        // Heap h = new Heap();
        // h.add(3);
        // h.add(4);
        // h.add(1);
        // h.add(5);
        // h.add(2);
        // while(!h.isEmpty()){
        //     System.out.print(h.remove() + " ");
        // }
        int arr[] = {1,2,4,3,5};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
