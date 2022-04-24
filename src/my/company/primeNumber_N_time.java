package my.company;

public class primeNumber_N_time {
    public static void main(String[] args) {
        
        int i,j,n=10;
        while (n!=0){

            for (i=2;true;i++){
                for ( j=2;true;j++){
                    if (i%j==0){
                        break;
                    }
                }
                if (i==j){
                    System.out.print(i+",");
                }
                n--;
            }
        }
    }
}
