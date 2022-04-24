package my.mywork;

public class PalindromString {
    public static void main(String[] args) {
        //method 1
        String str="MadaM";
        String str2="";
        for (int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
//        System.out.println(str2);
        if (str.equals(str2)){
            System.out.println("Palindrome");
        }
        else System.out.println("not palindrome");

//        method 2
        StringBuffer buffer=new StringBuffer(str);
        buffer.reverse();
        String data=buffer.toString();
        if (data.equals(str)){
            System.out.println("palindrome");
        }else System.out.println("not palin");

    }
}
