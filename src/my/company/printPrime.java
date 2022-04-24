package my.company;

import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int j;

        for (int i=2 ;i<=num;i++){
                for ( j=2;j>0;j++){
                    if (i%j==0){
                        break;
                    }
                }
                if (i==j){
                    System.out.println(j);
                }
        }
    }
}
