package my.company;

import java.util.Scanner;

public class stringPolidromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter String = ");
        Scanner sc=new Scanner(System.in);
        String myString=sc.next();
        StringBuffer buffer=new StringBuffer(myString);
        buffer.reverse();
        String Data=buffer.toString();
        if (myString.equals(Data)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
