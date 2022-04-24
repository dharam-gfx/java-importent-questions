package my.company;

import java.util.Scanner;

public class psQ6LargestNumberAmong3Number {

    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter 1 num ");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter 2 num ");
        b=sc.nextInt();

        System.out.println("Enter 3 num ");
        c=sc.nextInt();



        if (a>b && a>c) System.out.println("A ig Largest");
        else if (b>a && b>c) System.out.println("B is largest ");
        else System.out.println("C is largest");
    }

}
