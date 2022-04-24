package my.company;

public class mr_3 {
    public static void main(String[] args) {
        int num=50,i;
        for (int j=2;j<=num;j++){
            for ( i=2;i<num;i++){
                if (j%i==0){
                    break;
                }
            }
            if (j==i){
                System.out.print(i+",");
            }

        }
//        for ( i=2;i<=num;i++){
//            if (num%i==0){
//                break;
//
//            }
//
//        }
//        if (num==i){
//            System.out.println("p");
//        }
//        else System.out.println("n");
    }
}
