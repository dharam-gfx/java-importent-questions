package my.mywork;

import java.util.Arrays;

public class ArraySortedOrnot {
    public static void main(String[] args) {
       int [] arr3={78,215,615,4812};
       boolean arr=true;
       for (int i=0;i<arr3.length-1;i++){
           if(arr3[i]>arr3[i+1])
               arr=false;
       }
       if(arr){
           System.out.println("Sorted");
       }
       else
           System.out.println("Not Sorted");
    }

}
