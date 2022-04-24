package my.company;

import java.util.Scanner;
public class shivatest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int j;
        char ch1;
        System.out.println("Enter string length=");
        n=sc.nextInt();
        String[] array = new String[n+1];

        System.out.println("Please enter  names to sort");

        for (int i = 0; i <=n ;i++){

            array[i] = sc.nextLine();


        }


        for ( j=0 ;j<array.length;j++){


            String str = array[j];

//            Scanner sc = new Scanner(System.in);

//            System.out.print("Enter any String: ");
//            str = sc.nextLine();

            str = str.toLowerCase();


//            System.out.println("Vowels in the given String are:");

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {

                    System.out.print(" " + str.charAt(i)) ;
                }
            }
            }

    }

}