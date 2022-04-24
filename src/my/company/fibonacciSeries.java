package my.company;

import java.util.Scanner;

public class  fibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Enter num=");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i < num; ++i) {
            System.out.println(fib1(i));
        }

    }
    // Java program for Fibonacci number using recursion
    public static int fib1 (int num){
        if (num==1 || num==2){
            return 1;
        }
        return fib1(num-1)+fib1(num-2);
    }
    //Java program to calculate Fibonacci number using loop or Iteration.
//    public  static int fib2(int num){
//        if (num==1 || num==2){
//            return 1;
//        }
//        int f1=1; int f2=1; int f3=1;
//        for (int i=3;i<=num;i++){
//            f3=f1+f2;
//            f1=f2;
//            f2=f3;
//        }
//         return f3;
//    }



}
