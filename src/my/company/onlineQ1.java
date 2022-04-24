package my.company;
import java.util.Scanner;

class shape1{
     void rectangle(){

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter width=");
         int a=sc.nextInt();
         System.out.println("Enter Length=");
         int b=sc.nextInt();
        int area=a*b;
         System.out.println("Area of rectangle="+area);
    }
}
//class Shape extends shape1{
//}
public class onlineQ1 extends shape1 {
    public static void main(String[] args) {

//        Shape Area=new Shape();
        onlineQ1 Area=new onlineQ1();
        Area.rectangle();

    }
}
