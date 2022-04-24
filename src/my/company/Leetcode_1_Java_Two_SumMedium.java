package my.company;

public class Leetcode_1_Java_Two_SumMedium {
    public static void main(String[] args) {
        int [] arr={2,6,8,12,14}; //target 9
        int sum =0,num1=0,num2=0;
        for (int i=0 ;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]+arr[j]==4){
                    sum=arr[i]+arr[j];
                    num1=arr[i];
                    num2=arr[j];
                    System.out.println(num1 +" + "+num2 +" = "+sum);
                    break;

                }
            }
        }
    }
}
