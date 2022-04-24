package my.mywork;
public class traingalPattern {
    public static void main(String[] args) {
        int num=1;
        for (int i=5;i>=1;i--){
            int j;
            for ( j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=num;k++ ){
                System.out.print(" *");
            }
            num++;
            System.out.println();
        }

    }
}
