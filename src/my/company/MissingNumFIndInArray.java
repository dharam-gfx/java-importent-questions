package my.company;

import java.util.Scanner;

public class MissingNumFIndInArray {
    public static void main(String[] args) {
        int first,last,arr1;
        int sumUiarr=0;
        int sumarr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frst num=");
        first=sc.nextInt();
        System.out.println("Enter last num=");
        last=sc.nextInt();
        System.out.println("Enter array num=");
        int arr[]=new int[0];
        for (int j=first;j<last;j++){
            arr1=sc.nextInt();
            sumUiarr+=arr1;
        }

//        System.out.println("user int sum"+sumUiarr);


        for (int i=first;i<=last;i++){
            sumarr+=i;
        }
        int result=sumarr-sumUiarr;
        System.out.println("Missing element is = "+result);
    }
}
