package my.mywork;

public class calculatetime {
}
class Main {


    public void display() {
        System.out.println("Calculating Method execution time:");
    }


    public static void main(String[] args) {

        Main obj = new Main();
        for (int i=1;i<2116102;i++){
            System.out.println(i);
        }
        long start = System.nanoTime();
        obj.display();

        long end = System.nanoTime();
        float execution = end - start;
        System.out.println("Execution time: " + execution /1000000000 + " sec");
    }
}