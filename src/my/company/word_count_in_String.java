package my.company;

import java.util.Arrays;

// Dharmendra kumar
public class word_count_in_String {
    public static void main(String[] args) {
        String st1="Welcome to java";
        String st2="eWelcom toa jva";

        int count=1;
        for (int i=0;i<st1.length();i++){
            if (st1.charAt(i)==' ' && st1.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println("What is the ans= "+count);

        char []c1=st1.toLowerCase().toCharArray();
        char[] c2=st2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1,c2)){
            System.out.println("Equal ");
        }
        else System.out.println("not");

    }
}
