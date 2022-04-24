package my.company;

import java.util.Scanner;

public class psQ17ReverseaNumber {
    public static void main(String[] args) {
        int num,rev=0;
        System.out.println("Enter a num");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
//        while (num!=0){
//            rev=rev*10+num%10;
//            num=num/10;
//        }
        for (int i=0;num!=i;){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
