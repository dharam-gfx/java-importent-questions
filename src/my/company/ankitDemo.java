package my.company;

import java.util.ArrayList;

public class ankitDemo
{
    public static void main (String args[]) {

        ArrayList list=new ArrayList();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Size of list = "+list.size());
//        System.out.println(list.get(1));
        int i=0;
        System.out.println("using while loop");
        while (i<list.size()){
            System.out.print(list.get(i)+",");
            i++;
        }
        System.out.println("\n");
        System.out.println("using advance for loop");
        for (Object e:list)
            System.out.print(e+",");

        System.out.println("\n");
        System.out.println("using  for loop");
        for (int j=0;j<list.size();j++){
            System.out.print(list.get(j)+",");
        }



}
}