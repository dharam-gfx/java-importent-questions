package my.company;
import java.util.Scanner;

public class psQ21CharacterisVowelorConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a char");
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )||(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )){
            System.out.println(" the character '" +ch+"' is vowel");

        }

        else{

            System.out.println(" the character '"+ch+"' is consonant");
        }



    }
}
