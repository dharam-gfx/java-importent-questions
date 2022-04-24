package my.company;

public class mr_11 {
    public static void main(String[] args) {
        int [] arr={11,2,4,6,6,6,8,9,10};
        int linearSearch=6;
        int count=0;
        boolean status=false;
        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
            if (linearSearch==arr[i]){
//                System.out.println("find out "+arr[i]);
                status=true;
                count++;
//                break;
            }

        }
        if (status==true){
            System.out.println(+linearSearch+ " found "+count+" times in array");

        }
        else System.out.println("not found");
    }
}
