package my.company;

import java.util.Arrays;
import java.util.Scanner;

public class mr_12 {
    public static void main(String[] args) {
        int [] arr={4,2,1,5,3};
//        System.out.println("Before sorting array"+ Arrays.toString(arr));
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array"+ Arrays.toString(arr));

    }
}
