package my.company;

import java.util.Scanner;

public class revInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number for reverse ");
        int num;
        Scanner sc=new Scanner(System.in);


        num=sc.nextInt();
        int rev = 0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("the value of num "+rev);

        String st;
        System.out.println("enter string=");
        st=sc.next();

        for (int i=st.length()-1;i>=0;i--){
            System.out.print(st.charAt(i));
        }
    }
}
