package my.company;

import java.util.Scanner;

public class psQ9StringisPalindromeOrNot {
    public static void main(String[] args) {
        String myString;
        System.out.println("Enter a String ");
        Scanner sc=new Scanner(System.in);
        myString=sc.next();
        StringBuffer buffer=new StringBuffer(myString);
        buffer.reverse();
        String data=buffer.toString();
        if (myString.equals(data)){
            System.out.println(myString+ " is a Palindrome ");
        }
        else {
            System.out.println(myString+ " is not a Palindrome ");

        }
    }
}
