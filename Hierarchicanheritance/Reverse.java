package Hierarchicanheritance;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter a Name:");
        String str = sc.nextLine();
        int num = sc.nextInt();
         System.out.println("Enter a Name:");
        StringType st = new StringType(str);
        IntegerType it = new IntegerType(num);

        st.reverse();
        it.reverse();
    }
}


abstract class Type {
    abstract void reverse();
}


class StringType extends Type {
    private String str;

    public StringType(String str) {
        this.str = str;
    }

    @Override
    void reverse() {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed String: " + sb.reverse());
    }
}


class IntegerType extends Type {
    private int num;

    public IntegerType(int num) {
        this.num = num;
    }

    @Override
    void reverse() {
        int reversed = 0, temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed Integer Digits: " + reversed);
    }
}