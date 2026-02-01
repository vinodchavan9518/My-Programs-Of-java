package Queue_Collection.PriorityQueue;
import java.util.PriorityQueue;
//find priority based on natural ordering
public class PriorityDemo1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Banana");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Orange");
        pq.add("Grapes");
        
        while(!pq.isEmpty())
        {
            IO.println(pq.poll());
        }
    }
    
}
