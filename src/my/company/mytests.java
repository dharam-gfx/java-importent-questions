package my.company;
// Java program to remove the first and
// the last character of a string
public class mytests {
    public static void main(String[] args) {
        String str = "Indiay";
        char ch='y';
        int count=0;
        boolean flag=false;
        for (int j=0; j<str.length()-1 ;j++){
            count++;

        }
//        System.out.println(count);
        for (int i=0;i<str.length()-1 ;i++){
            if (str.charAt(count)==ch){
                flag=true;
            }
        }
        int c=count;
        if (flag==true){
            System.out.println(charRemoveAt(str, c));
        }

    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}