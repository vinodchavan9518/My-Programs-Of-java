package Interview_question;
//Count occurrences of a character in a string
public class CountCharacter {
    public static void main(String[] args) { 
String str = "Automation"; 
char ch = 'a'; 
int count = 0; 
for (char c : str.toCharArray()) { 
if (c == ch) count++; 
} 
System.out.println(count); 
} 

}
