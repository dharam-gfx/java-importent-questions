package my.company;

public class stringIncrement {
    public static void main(String[] args) {
        String st="dharam";
        String st1= "";
        for (int i=0;i<st.length();i++){
            st1+=(char)(st.charAt(i)+1);
        }
        System.out.println(st1);
    }
}
