package my.company;

import java.util.Scanner;

class Student{
    public void stdt(String n,int r,Double m){
        System.out.println("Name -"+n);
        System.out.println("Roll No -"+r);
        System.out.println("Marks -"+m);
    }
}

public class bookPageN1_44 {
    public static void main(String[] args) {
        Student st=new Student();
        Scanner sc=new Scanner(System.in);

        for (int i=1;i<=3;i++){
            System.out.println("Enter "+i+" Name- ");
             String n=sc.next();
            System.out.println("Enter "+i+" Roll No- ");
             int r=sc.nextInt();
            System.out.println("Enter "+i+" Marks- ");
             Double m=sc.nextDouble();
            st.stdt(n,r,m);
        }

    }
}
