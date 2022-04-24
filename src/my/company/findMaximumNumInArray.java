package my.company;
public class findMaximumNumInArray {
    public static void main(String[] args) {
        int arr[]={22,11,44,15,23,77,55};
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("tha max value is "+max);
        System.out.println("tha min value is "+min);
    }
}
