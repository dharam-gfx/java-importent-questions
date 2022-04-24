package my.company;

import java.util.Arrays;

public class mr_10 {
    public static void main(String[] args) {
        int [] arr={4,6,3,7,8,9,5,10,2,1};
        int key=10;
        boolean status=false;
        // make ascending order
        Arrays.sort(arr);

//        for (int element:arr) {
//            System.out.println(element);
//        }
        int l=0;
        int h=arr.length;
//        System.out.println(arr.length);

        while (l<=h){
            int m=(l+h)/2;

            if (key==m){
                status=true;
                break;
            }
            if (key>m){
                l=m+1;
            }
            if (key<m){
                h=m-1;
            }
        }
        if (status){
            System.out.println("element found");
        }

        else System.out.println("Element not found");

    }
}
