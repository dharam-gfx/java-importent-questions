package my.mywork;

import java.util.Arrays;

public class LCM2num {
    public static void main(String[] args) {
        int l1=6;
        int l2=8;
        int lcm;
        if (l1>l2) lcm=l1;
        else lcm=l2;
        while (true){
            if (lcm%l1==0 && lcm%l2==0){
                break;
            }
            lcm++;
        }
        System.out.println(lcm);
        
    }
}
