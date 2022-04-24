package my.mywork;

import java.util.Scanner;

public class sumOfPosetiveNum {
    public static void main(String[] args) {
        System.out.println("Enter loop number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while (num>0){
            System.out.println("Enter number for add");
            int input;
            input=sc.nextInt();
            if (input>0){
                sum+=input;
            }
            num--;
        }
        System.out.println("Result="+sum);
    }
}
