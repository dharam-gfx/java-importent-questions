package my.company;

public class rowcol {
    public static void main(String[] args) {
      for (int i=0;i<2;i++){
          if (i==0){
              System.out.print("Name    ");
              System.out.print("ROll    ");
              System.out.print("MO     ");
              continue;
          }
          System.out.println("");
         for (int j=1;j<=i;j++){
             System.out.print("Ram    ");
             System.out.print("245    ");
             System.out.print("70114    ");
             System.out.println();
             System.out.print("Ram    ");
             System.out.print("245    ");
             System.out.print("70114    ");
         }
      }
    }
}
