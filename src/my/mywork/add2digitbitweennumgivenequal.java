package my.mywork;

import java.util.Scanner;

public class add2digitbitweennumgivenequal {
    public static void main(String[] args) {

        int arr[]=new  int[10];
        for (int i=0;i<10;i++){
            arr[i]=i+1;
        }
//        for(int e:arr){
//            System.out.println(e);
//        }

        for (int i=0;i<arr.length/2;i++){
            for (int j=1;j<(arr.length);j++){
                if (arr[i]+arr[j]==10){
                    System.out.println(+arr[i]+" + "+arr[j]+" = "+(arr[i]+arr[j]));
                }
            }
        }
    }
}
