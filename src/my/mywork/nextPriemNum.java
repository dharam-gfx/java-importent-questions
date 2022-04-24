package my.mywork;

public class nextPriemNum {
    public static void main(String[] args) {
        int num=9;
        int i;
//        for (i=2;i<=num;i++){
//            if (num%i==0){
//                break;
//            }
//        }
//        if (num==i){
//            System.out.println(num);
//        }
//        else {
//            int j;
//            while(true){
//                ++num;
//                for (j=2;j<=num;j++){
//                    if (num%j==0){
//                        break;
//                    }
//                }
//                if (num==j){
//                    System.out.println(num);
//                    break;
//                }
//            }
//        }

        while (true){
            for (i=2;i<=num;i++){
                if (num%i==0){
                    break;
                }
            }
            if (num==i){
                System.out.println(num);
                break;
            }else{
                num++;
            }
        }

    }
}
