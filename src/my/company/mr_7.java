package my.company;

public class mr_7 {
    public static void main(String[] args) {
        int num1=40;
        int num2=100;
        int num3=200;
        int hcf=0;
        for (int i=1;i<=num1;i++){
            if (num1%i==0 && num2%i==0 && num3%i==0){
                hcf=i;
            }
        }

        System.out.println(hcf);


    }
}
