package my.company;

import java.util.Scanner;

public class psQ19PrintSubstringofGivenString {
    public static void main(String[] args) {
        String st,sub;
        System.out.println("Enter a String ");
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine();

        int len=st.length();

        for (int i=0 ;i<len;i++){

            for (int j=1;j<=len-i;j++){
                sub=st.substring(i,i+j);
                System.out.println(sub);
            }
        }

    }
}
