package my.company;

import java.util.Random;

public class ps16PrintRandomNum {
    public static void main(String[] args) {

        Random random=new Random();
        for (int i=1;i<=10;i++){
            int ran=random.nextInt(100);
            System.out.println(ran);
        }
    }
}
