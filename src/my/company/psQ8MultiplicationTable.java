package my.company;

import java.util.Scanner;

public class psQ8MultiplicationTable {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (int i=1 ;i<=10;i++){
            int c=num*i;
            System.out.println(+num+ "X" +i+ "=" +c);
        }
    }
}
