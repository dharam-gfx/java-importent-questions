package my.company;

import java.util.Scanner;

public class checkPrimeWhike {
    public static void main(String[] args) {
        int num,i=2;
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while (num>0){
            if (num%i==0){
                break;
            }
            i++;
        }
//        for (i=2;num>0;i++){
//            if (num%i==0){
//                break;
//            }
//        }
        if (num==i){
            System.out.println("prime");
        }
        else {
            System.out.println("not a prime");
        }

    }
}
