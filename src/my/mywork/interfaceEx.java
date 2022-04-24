package my.mywork;

import java.util.Date;

interface clock{
    void time();
    void time(long t);
    String Time(String T);
}
class Myclock implements clock{

    @Override
    public void time() {
        System.out.println("hello");
    }
    @Override
    public void time(long t) {

        System.out.println(t);
    }
    @Override
    public String Time(String t) {
        return t;
    }

}

public class interfaceEx {
    public static void main(String[] args) {
        Myclock Clock=new Myclock();
        Clock.time();
        Date dt=new Date();
        long time = dt.getTime();
        Clock.time(time);
       String Time= Clock.Time("12:30 PM");
        System.out.println(Time);
    }
}
