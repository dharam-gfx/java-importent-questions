package my.company;

import java.util.Scanner;

public class bookPageN1_50 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();


            System.out.println("the num at "+num+" is "+fib(num));

    }
    public static int fib(int num){
        if (num==1 || num==2){
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
 }

