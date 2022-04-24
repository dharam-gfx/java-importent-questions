import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("abc");
        list.add(200);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);
    }
}
