package my.company;

public class factRecursion {
    public static void main(String[] args) {
        int num=5;
        int num2=20;
            System.out.println(fact(num));
            for (int i=1;i<=num2;i++){
                System.out.println(fact33(i));
            }
        System.out.println(fact33(10));
    }
    static int fact(int num){
        if (num==0) {
            return 1;
        }
        return num*fact(num-1);
    }
    static int fact33(int num2){
        if (num2==1 || num2==2){
            return 1;
        }
        return fact33(num2-1)+fact33(num2-2);
    }
}
