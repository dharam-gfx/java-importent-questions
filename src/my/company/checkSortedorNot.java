package my.company;


import java.util.Arrays;

public class checkSortedorNot {
    public static void main(String[] args) {
    int [] arr1={88,22,44,66,88,99};
    int [] arr2=arr1;
    boolean status=false;
        Arrays.sort(arr2);
        for (int el:arr2
             ) {
            System.out.println(el);

        }



        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    status=true;
                   
                }
            }
        }
        if (status=false)
            System.out.println("not sorted");
        else
            System.out.println("sorted");


    }
}
