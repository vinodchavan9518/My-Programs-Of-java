package Interview_question;
//Remove white spaces from a string
public class RemoveWhiteSpaces {
    public static void main(String[] args) { 
String str = " A u t o m a t i o n "; 
String result = str.replaceAll("\\s+", ""); 
System.out.println(result); 
} 
}
    

