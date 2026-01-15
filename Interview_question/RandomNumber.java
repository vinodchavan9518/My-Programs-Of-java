package Interview_question;
//Generate 5 random numbers between 0-99
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) { 
Random random = new Random(); 
for (int i = 0; i < 5; i++) { 
System.out.println(random.nextInt(100)); // Random number between 0-99 
} 
} 

    
}
