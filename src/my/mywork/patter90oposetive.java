package my.mywork;

public class patter90oposetive {
    public static void main(String[] args) {
        int num=1;
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=num;k++){
                System.out.print("* ");

            }
            num++;
            System.out.println();
        }
    }
}
