package my.company;

public class psQ15tNumbersinTriangleShape {
    public static void main(String[] args) {
        int num=10,t=1;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}
