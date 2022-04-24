package my.company;

import java.util.Scanner;

public class psQ7LeepYearCheck {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter year =");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if (year%4==0){
            System.out.println(year+" is a Leap year ");
        }
        else System.out.println(year+" is not a Leap year ");

    }
}
