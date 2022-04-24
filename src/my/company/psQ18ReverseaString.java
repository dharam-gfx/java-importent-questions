package my.company;

import java.util.Scanner;

public class psQ18ReverseaString {
    public static void main(String[] args) {
        String myString;
        System.out.println("enter a String");
        Scanner sc= new Scanner(System.in);
        myString=sc.next();
        // Method 1
        StringBuffer buffer=new StringBuffer(myString);

        System.out.println(buffer.reverse());

        //Method 2
        for (int i=myString.length()-1;i>=0;i--){
            System.out.print(myString.charAt(i));
        }

    }
}
