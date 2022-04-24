package my.company;

import java.util.HashSet;
import java.util.Scanner;

public class findDuplicateElement {
    public static void main(String[] args) {
        int arr[] = {11, 9, 33, 44,9, 6};
        boolean flag = false;


        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("found " + i);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("not found");
        }

        //method 2

        System.out.println("***********************************");

        HashSet<String> hashSet=new HashSet<>();

        String st[]={"java","c","Python",".net","java"};
        boolean b=false;

//        Scanner sc=new Scanner(System.in);
//        for (int i=1;i<=5;i++){
//            st[i]=sc.next();
//        }

//        for (String element:st){
//            if (hashSet.add(element)==false){
//                System.out.println("found duplicate "+element);
//                b=true;
//            }
//        }
//        if (b==false){
//            System.out.println("not found");
//        }

    }
}
