package my.company;

import java.util.Scanner;

public class psQ4Factrioall {
    public static void main(String[] args) {
        int num,result=1;
        System.out.println("Enter a num ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            result*=i;
        }
        System.out.println("fact = "+result);
    }
}
