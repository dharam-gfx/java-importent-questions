package my.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mr_2 {
    public static void main(String[] args) {
        String str1="dharam";
        String str2="mardha";

        boolean status;

        char[] st1=str1.toLowerCase().toCharArray();
        char [] st2=str2.toLowerCase().toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
//        System.out.println(st2[2] );
        status= Arrays.equals(st1, st2);
        if (status){
            System.out.println("anagram");
        }
        else System.out.println("not");

        String s1="8912345 ";
        String s2="5124 893";
        boolean check;
        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
//        System.out.println(c1);
        check= Arrays.equals(c1,c2);
        if (check){
            System.out.println(" 2 anagaram");

        }
        else System.out.println(" 2not anagram");

    }
}
