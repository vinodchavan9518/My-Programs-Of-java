package Queue_Collection.PriorityQueue;
import java.util.PriorityQueue;
//find priority based on reverse order
public class PriorityQueueDmoe2 {
    void main()
    {
        PriorityQueue<String> maxHeap=new PriorityQueue<>(java.util.Collections.reverseOrder());
        maxHeap.add("Banana");
        maxHeap.add("Apple");
        maxHeap.add("Mango");
        maxHeap.add("Orange");
        maxHeap.add("Grapes");
        while(!maxHeap.isEmpty())
        {
            IO.println(maxHeap.poll());
        }








    }
    
}
