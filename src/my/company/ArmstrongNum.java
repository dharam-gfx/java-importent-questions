package my.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num;
        int orn; int rim;int result=0;
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        int arr[]={num};
        int power= Arrays.toString(arr).length()-2;
        orn=num;
        while (orn!=0){
            rim=orn%10;
            result+=Math.pow(rim,power);
            orn/=10;
            System.out.printf(""+rim);

        }
        if (result==num){
            System.out.println(num+" is armstrong");
        }
        else {
            System.out.println(num+" is not armstrong");
        }

    }
}
