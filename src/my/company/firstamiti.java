package my.company;

public class firstamiti {
    public static void main(String[] args) {
        String str = "dharam";

        System.out.println(str.indexOf('m'));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'm') {
                System.out.println("index m="+i);
                break;
            }

        }
    }



}
