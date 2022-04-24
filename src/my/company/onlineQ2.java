package my.company;
import java.util.Scanner;
class calculation{
    void arop(int a ,int b){
        System.out.println("Add="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("mul="+(a*b));
        System.out.println("div="+(a/b));
    }
}
class arithOper extends calculation{
}
public class onlineQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 num =");
        int a=sc.nextInt();
        System.out.println("Enter 2 num =");
        int b=sc.nextInt();
        arithOper ar=new arithOper();
        ar.arop(a,b);

    }
}
