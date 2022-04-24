package my.company;

import java.util.Scanner;

public class psQ3ChckVowelsInStr {
    public static void main(String[] args) {
        String st;
        char ch;
        int con=0;
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        st=sc.next();

        for (int i=0;i<st.length();i++){
            ch=st.charAt(i);
            switch (ch){

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':

                    con=1;
                    System.out.print(" "+ch);
            }

        }
        if (con==0){
            System.out.println("no vowels");
        }
    }

}
