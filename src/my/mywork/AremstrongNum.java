package my.mywork;

public class AremstrongNum {
    public static void main(String[] args) {
        int num=153;
        int num2=num;
        int num3=num;
        int count=0;
        int rim=0;
        int result=0;
        while (num2!=0){
            num2=num2/10;
            count++;
        }
//        System.out.println(count);
        while (num3!=0){
            rim=num3%10;
            num3=num3/10;
            result+=(int) Math.pow(rim,count);
//            System.out.println(rim);
        }
        System.out.println(result);
        if (num==result){
            System.out.println("Armstrong");
        }
        else System.out.println("not Arm");
    }

}
