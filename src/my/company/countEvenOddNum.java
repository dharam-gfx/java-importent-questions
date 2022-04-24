package my.company;

import java.util.Scanner;

public class countEvenOddNum {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        int rev=0;
        int rim;
        int count1=0;
        int count2=0;
        //1st

        while (num>0){
            rim=num%10;
            num=num/10;
            if (rim%2==0){
                count1++;
            }
            else {
                count2++;
            }

        }

        //2 nd method
//        while (num!=0){
//            rev=rev*10+num%10;
//            num=num/10;
//            if (rev%2==0){
//                count1++;
//            }
//            else{
//                count2++;
//            }
//        }

        System.out.println("Total Even  "+count1);
        System.out.println("TotalOdd "+count2);
    }
}
