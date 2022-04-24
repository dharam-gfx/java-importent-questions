package my.company;

public class mr_6 {
    public static void main(String[] args) {
        int num=5;
        for (int i=1;i<=num;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int k=num-1;k>=1;k--){

            for (int l=1;l<=k;l++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
