package Collection_Framerwork.Queue;

import java.util.PriorityQueue;
//find the minimum element in the priority queue
public class PriorityDemo1 {
    public static void main(String[] args) {
        
       
		  PriorityQueue<String> pq = new PriorityQueue<>(); 
          pq.add("2"); 
          pq.add("4");           
 pq.add("6");   
          System.out.print(pq.peek() + " ");  //    6 9 
          pq.offer("1"); 
 pq.offer("9"); 
          pq.add("3");   // 2 2  3   4   4       
  
          pq.remove("1"); 
          System.out.print(pq.poll() + " ");  
          if (pq.remove("2")) 
    { 
              System.out.print(pq.poll() + " "); 
 } 
          System.out.println(pq.poll() + " " + pq.peek()+"  "+pq.poll()); 
  
    }
    
}
