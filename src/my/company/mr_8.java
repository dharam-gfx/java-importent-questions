package my.company;

import java.util.Arrays;

public class mr_8 {
    public static void main(String[] args) {
        int num1=40;
        int num2=100;

        int temp=0;
        for (int i=1;i<=num1;i++){
            if (num1%i==0 && num2%i==0 ){
                temp=i;
            }
        }
        int m=num1*num2;
        System.out.println(m/temp);
        System.out.println(temp);

    }
}
