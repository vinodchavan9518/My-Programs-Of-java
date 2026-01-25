package Map_Collections.HashCodeAndEquals;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1 == str2: " + (str1 == str2)); // false

        System.out.println("str1.hashCode(): " + str1.hashCode());
        System.out.println("str2.hashCode(): " + str2.hashCode());

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // false
        System.out.println("obj1 == obj2: " + (obj1 == obj2)); // false

        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
    }
}
