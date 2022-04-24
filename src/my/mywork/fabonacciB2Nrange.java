package my.mywork;

public class fabonacciB2Nrange {
    public static void main(String[] args) {
        int start=5;
        int end=40;
        int f1=0;
        int f2=1;
        int f3;
        int count=0;
        for (; ;){
            if (f1<=end){
                if (f1>=start){
                    System.out.println(f1);
                }
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
