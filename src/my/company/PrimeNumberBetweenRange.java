package my.company;

public class PrimeNumberBetweenRange {
    public static void main(String[] args) {
        int a=10,b=50,i;
        for (int j=a;j<=b;j++){

            for ( i=2;true;i++){
                if (j%i==0){
                    break;
                }
            }
            if (i==j){
                System.out.print(" "+i);
            }
        }
    }
}
