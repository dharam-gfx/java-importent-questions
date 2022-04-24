package my.mywork;

public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int num2=num;
        int num3=num;
        int rim=0;
        int result=0;
        int count=0;
        while (num2!=0){
            num2=num2/10;
            count++;
        }
        System.out.println(count);
        for(int i=0;i<=count;i++){
            rim=num3%10;
            num3=num3/10;
            result+= (int) Math.pow(rim,count);

        }
        System.out.println(result);
        if (num==result){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");

        }
    }

}
