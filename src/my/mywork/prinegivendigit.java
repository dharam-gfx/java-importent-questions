package my.mywork;

public class prinegivendigit {
    public static void main(String[] args) {
        int number=10;
        int count =0;
        int j=2;
       while (j!=0){
           int i;
           for (i=2;i<=j;i++){
               if(j%i==0){
                   break;
               }
           }
           if (i==j){
               System.out.println(i);
               count++;
           }
           j++;
           if (count==number){
               break;
           }
       }
    }
}
