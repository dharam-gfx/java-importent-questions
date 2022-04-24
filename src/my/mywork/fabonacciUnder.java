package my.mywork;

public class fabonacciUnder {
    public static void main(String[] args) {

        int num=40;
        int f1=0;
        int f2=1;
        int f3;
        int count=0;
        for (int i=0;true;i++){
            if (f1<=num){

                   System.out.println(f1);
            }
            else {
                break;
            }
            f3=f1+f2;
            f1=f2;
            f2=f3;
            count++;
        }
        System.out.println("count="+count);
    }
}
