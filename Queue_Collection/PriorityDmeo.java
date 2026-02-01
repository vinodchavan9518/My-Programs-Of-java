package Queue_Collection;

import java.util.Collections;
import java.util.PriorityQueue;
//find priority based on reverse order
public class PriorityDmeo {
    void main()
    {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(12);
		maxHeap.add(108);
		maxHeap.add(38);
		maxHeap.add(302);
		
		while(!maxHeap.isEmpty())
		{
			IO.println(maxHeap.poll());
			
		}
		
    }
    
}
