package my.company;

import java.util.Scanner;

public class checkPimeNum {
    public static void main(String[] args) {
        System.out.println("Enter num check prime or not=");
        int num;
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for( j=2;j<=num;j++){
            for ( i=2; i<=j;i++){
                if (j%i==0){
                    break;
                }
            }
            if (j==i){
                System.out.println("prime"+i);
            }
//            else {
//                System.out.println("not prime ");
//            }
        }
    }
}
