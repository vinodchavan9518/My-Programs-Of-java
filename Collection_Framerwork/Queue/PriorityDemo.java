package Collection_Framerwork.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
//find the maximum element in the priority queue
public class PriorityDemo {
    public static void main(String[] args) {
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
