package my.company;

import java.util.Scanner;

public class largestNumIn3input {
    public static void main(String[] args) {

        int a, b,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1 num");
        a=sc.nextInt();
        System.out.println("Enter 2 num");
        b=sc.nextInt();
        System.out.println("Enter 3 num");
        c=sc.nextInt();

        if (a>b && a>c){
            System.out.println("A is largest number");
        }
        else if (b>a && b>c){
            System.out.println("B is largest number");
        }
        else if (c>a && c>b){
            System.out.println("C is largest number");
        }
    }
}
