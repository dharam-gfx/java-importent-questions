package my.company;

public class oneNextPrimeNumber {
    public static void main(String[] args) {
        int num=7,i;
        ++num;
        boolean status=true;
        while (status){
            for (i=2;i<=num;i++){
                if (num%i==0){
                    break;
                }
            }
            if (num==i){
                System.out.println(num);
                status=false;
            }
            else {
                num++;
            }
        }
    }
}
