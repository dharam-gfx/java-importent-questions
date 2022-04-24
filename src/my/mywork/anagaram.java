package my.mywork;


import java.util.Arrays;

public class anagaram {
    public static void main(String[] args) {
   String str1="dhram";
   String str2="madhar";
   str1=str1.toLowerCase();
   str2=str2.toLowerCase();

   char [] chararr1=str1.toCharArray();
   char [] chararr2=str2.toCharArray();
   Arrays.sort(chararr1);
   Arrays.sort(chararr2);
   chararr1.toString();
   chararr2.toString();
   boolean check=Arrays.equals(chararr1,chararr2);
   if (check){
       System.out.println("ang");
   }else System.out.println("not");




    }
}
