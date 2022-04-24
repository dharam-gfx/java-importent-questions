package my.company;

import java.util.Scanner;

public class fibonacciSeries2 {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int f1=0, f2=1,f3;
        for (int i=0;i<num;++i){
            System.out.print(f1+",");
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }


    }
}
