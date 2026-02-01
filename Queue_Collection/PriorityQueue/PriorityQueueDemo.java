package Queue_Collection.PriorityQueue;
import java.util.PriorityQueue;
//find priority based on natural ordering
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(45);
        minHeap.add(12);
        minHeap.add(78);
        minHeap.add(23);
        minHeap.add(56);
        
        while(!minHeap.isEmpty())
        {
            IO.println(minHeap.poll());
        }
    }
    
}
