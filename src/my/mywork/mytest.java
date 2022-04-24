package my.mywork;

public class mytest {
    public static void main(String[] args) {
      int num=6;
      for (int i=1;i<=num;i++){
          for (int j=i;j<=num;j++){
              System.out.print("  ");
          }
          for (int j=2;j<=i;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
      for (int i=1;i<=num;i++){
          for (int j=2;j<=i;j++){
              System.out.print("  ");
          }
          for (int j=i;j<=num;j++){
              System.out.print("* ");
          }

          System.out.println();
      }

    }
}
