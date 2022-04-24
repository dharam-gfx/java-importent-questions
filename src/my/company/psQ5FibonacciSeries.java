package my.company;

import java.util.Scanner;

public class psQ5FibonacciSeries {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println(fib5(i));
        }

    }
    public static int fib5(int num ){
        if (num==1 || num ==2){
            return  1;

        }
        return fib5(num-1)+fib5(num-2);
    }
}
