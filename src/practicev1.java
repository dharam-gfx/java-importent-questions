import java.util.Scanner;

public class practicev1 {
    public static void main(String[] args) {
        char[] ch={'a','e','i','o','u'};
//        String [] str=new String[];
        int l;
        String str;

        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        str=sc.next();


        for (int i = 0; i <str.length(); i++) {
            for(int j=0;j<ch.length;j++) {
                if (str.charAt(i) == ch[j]) {
                    System.out.println(ch[j]);

                }
            }





        }


    }
}
