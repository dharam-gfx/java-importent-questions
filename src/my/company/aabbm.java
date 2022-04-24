package my.company;

public class aabbm {
    public static void main(String[] args) {
      int num=100;
      int count, cum;
      count=0;
      cum=1;
      do {
          count=count+(num/2);
          cum=cum+(count/3);
          num=num/10;

      }while (num>0);
        System.out.println(cum+2);

    }

}
