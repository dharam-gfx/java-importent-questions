package my.mywork;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1211;
        int num2=num;
        int rev=0;
        while (num2!=0){
            rev=rev*10+num2%10;
            num2=num2/10;

        }
        System.out.println(rev);
        if (num==rev){
            System.out.println("palindrome");
        }else System.out.println("Not palindrome");

    }
}
