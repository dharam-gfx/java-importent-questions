package my.mywork;

public class fabonacciNum {
    public static void main(String[] args) {
        int num=20;
        int f1=0;
        int f2=1;
        int f3;
        int count=0;
        for (int i=0;i<num;i++){
            System.out.println(f1);
            f3=f1+f2;
            f1=f2;
            f2=f3;
            count++;
        }
        System.out.println("count="+count);
    }
}
