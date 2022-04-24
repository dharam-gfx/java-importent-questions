package my.mywork;

public class recurationNaturalnum {
    public static void main(String[] args) {
       int a=1;
       int b=10;
       NaturNum(a,b);
    }
    public static void NaturNum(int a,int b){
        if (a<=b){
            System.out.println(a);
            a++;
            NaturNum(a,b);

        }
    }
}
