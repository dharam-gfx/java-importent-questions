package my.company;

import java.util.Scanner;

public class psQ11NumberisPrime {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        int num,i ;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        for ( i=2;i<=num;i++){
            if (num%i==-0){
                break;
            }
        }
        if (num==i){
            System.out.println("Prime ");
        }
        else System.out.println("not a Prime");
    }
}
