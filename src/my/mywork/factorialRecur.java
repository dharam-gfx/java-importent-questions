package my.mywork;
public class factorialRecur {
    private static int num;

    public static void main(String[] args) {
        int fact=5;
       int b= factorial(fact);
        System.out.println(b);

    }


    public static int factorial(int num){
        if (num==0){
            return  1;
        }
        return num *factorial (num - 1);
    }


}
