package my.company;

import java.util.Scanner;

public class psQ22NumberisOddorEven {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a num");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        if (a%2==0){
            System.out.println("Even ");

        }
        else System.out.println("odd ");
    }
}
