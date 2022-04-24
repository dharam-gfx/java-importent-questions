package my.mywork;
public class primenum {
    public static void main(String[] args) {
        int num=11;
        int i;
        for ( i=2;i<=num;i++){
            if (num%i==0){
                break;
            }
        }
        if (i==num){
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
