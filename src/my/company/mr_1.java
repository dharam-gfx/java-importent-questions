package my.company;

import java.util.Scanner;

public class mr_1 {
    static int fibs(int num){
        if (num==1 || num==2){
            return 1;
        }
        return fibs(num-1)+fibs(num-2);
    }

    static int fibs2(int num){
        if (num==1 || num==2){
            return 1;

        }
        int f1=1, f2=1, f3=1;
        for (int i=3;i<=num;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;

        }
        return f3;

    }

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        num=sc.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++){
//            System.out.println(fibs(i));
//            System.out.println(fibs2(i));
            fact*=i;
        }
        System.out.printf("the fact of %d= %d ",num,fact);
    }

}
