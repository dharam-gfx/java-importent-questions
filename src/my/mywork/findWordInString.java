package my.mywork;
public class findWordInString {
    public static void main(String[] args) {
        String str="This is a book it is for rahul you can ask him";
        String check="book";

        String result[]=str.split(" ");
        int len=result.length;
        String replaace[]=new String[len];

//       word  posection count from string
        for (int i=0;i<result.length;i++){
            if (check.equals(result[i])) {

                System.out.println("Position of "+check+ " is "+ (i+1));
            }
        }

        // word replace from string
        String change="pen";
        for (int i=0;i<result.length;i++){
            if (check.equals(result[i])) {
               replaace[i]=change;
            }
            else {
                replaace[i]=result[i];
            }
        }
        for (int i=0;i<replaace.length;i++){
            System.out.print(replaace[i]+" ");
        }




    }
}
