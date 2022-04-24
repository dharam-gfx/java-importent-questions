package my.company;

import java.util.Scanner;

public class psQ10NumberisPositiveorNegative {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a num");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num>0) System.out.println(num + " Positive Number");
        else if (num<0) System.out.println(num+ " Negative Number");
        else System.out.println(num+ " Equal Zero");
    }
}
