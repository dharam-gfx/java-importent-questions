package my.company;
import java.util.Scanner;

public class psQ1AlphabetOrNot {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a char =");
        Scanner sc=new Scanner(System.in);
         ch=sc.next().charAt(0);
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is an a Alphabet");
        }
        else {
            System.out.println(ch+ "is a not a Alphabet");
        }


    }
}
