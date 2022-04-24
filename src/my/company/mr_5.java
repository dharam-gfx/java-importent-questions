package my.company;

public class mr_5 {
    public static void main(String[] args) {
     int num=153;
     int num2=num;
     int rev=0, result=0;

     while (num2!=0){
         rev=num2%10;
         result+= (int) Math.pow(rev,3);
         num2=num2/10;
     }
     if (num==result){
         System.out.println("arm");
     }
     else System.out.println("not");

    }

}
