package my.company;

import java.util.Scanner;

public class sumOfDigitInNumber {
    public static void main(String[] args) {
        int num,sum=0;
        int rim;
        System.out.println("Enter a num=");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while (num>0){
            rim=num%10;
            sum+=rim;
            num=num/10;
        }
        System.out.println("Sum of Entered Number is "+sum);
    }
}
