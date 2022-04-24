package my.company;

import java.util.Scanner;

public class psQ2ArmstrongNumber {
    public static void main(String[] args) {
        int num ,riv2,sum=0,count=0;
        System.out.println("Enter a num ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int num2=num;
        int num3=num;

        while (num3!=0){
//            riv1=num3%10;
            num3=num3/10;
            count++;
        }

        while (num2!=0){
            riv2=num2%10;
            sum+=Math.pow(riv2,count);
            num2=num2/10;
        }
        System.out.println(sum);
        if (sum==num){
            System.out.println("Armstrong num");
        }
        else {
            System.out.println("not Armstrong num");
        }

    }
}
