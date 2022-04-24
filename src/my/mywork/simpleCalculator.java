package my.mywork;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("===========");
        System.out.println("1. Add");
        System.out.println("2. sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("0. Exit");
        System.out.println("==========");

        while (true){
            System.out.println("Enter your Choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter 1 Num=");
                    int num1=sc.nextInt();
                    System.out.println("Enter 2 Num=");
                    int num2=sc.nextInt();
                    System.out.println("Result="+(num1+num2));
                    break;
                    case 2:
                    System.out.println("Enter 1 Num=");
                    int num3=sc.nextInt();
                        System.out.println("Enter 2 Num=");

                        int num4=sc.nextInt();
                    System.out.println("Result="+(num3-num4));
                    break;
            }
            if (choice==0){
                System.out.println("Thank u for using this Calculator");
                break;
            }
        }
    }
}
