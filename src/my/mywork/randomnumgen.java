package my.mywork;

import java.util.Random;

public class randomnumgen {
    public static void main(String[] args) {
        Random ran=new Random();
        int num=ran.nextInt(10);
        System.out.println(num);

//        System.out.println(Math.max(10,20));
    }
}
