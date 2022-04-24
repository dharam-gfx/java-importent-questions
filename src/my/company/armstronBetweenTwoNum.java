package my.company;

public class armstronBetweenTwoNum {
    public static void main(String[] args) {
        for (int i=10;i<=10000;i++){

//            int i=153;
            int num2=i;
            int num3=i;
            int rim=0,result=0,count=0;
            while (num3!=0){
                num3=num3/10;
                count++;
            }

            while (num2!=0){
                rim=num2%10;
                result+=Math.pow(rim,count);
                num2=num2/10;

            }
            if (i==result){
                System.out.print(result+",");
            }
        }

    }
}
