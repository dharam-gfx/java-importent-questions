package my.mywork;
class Cars{
    private String col;

    public void color(String str){
        System.out.println("white");
        this.col=str;
        System.out.println(this.col);
    }
}
public class mutest {
    public static void main(String[] args) {
       Cars mycar=new Cars();
       String str="Red";
       mycar.color(str);

    }
}
