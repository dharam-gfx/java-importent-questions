package my.company;

import java.util.Scanner;

public class IntPolidrome {
    public static void main(String[] args) {

        String str;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data=buffer.toString();
        if (str.equals(data)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
