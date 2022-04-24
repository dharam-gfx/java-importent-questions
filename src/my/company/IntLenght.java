package my.company;

import java.util.Scanner;

public class IntLenght {
    public static void main(String[] args) {
        System.out.println("Enter a num=");
        int num;
        int count = 0;
        Scanner scn=new Scanner(System.in);
        num=scn.nextInt();
        for (int i=0;num>0;count++){
            num=num/10;
        }
        System.out.println(count);
    }
}
