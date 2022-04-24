package my.company;

public class fibonacciSeriesBettweenRange {
    public static void main(String[] args) {
        int num1=0,num2=90;
        int arr[]=new int[num2];
        int f1=0,f2=1,f3;
        for (int i=0;true;i++){
            if (f1<=num2) {
                arr[i]=f1;
//                System.out.print(f1+",");
            }
            else{
                break;
            }

            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        for (int j=0;j<num2;j++){
            if (arr[j]>num1 && arr[j]<num2)
                System.out.print(arr[j]+",");
        }

    }
}

