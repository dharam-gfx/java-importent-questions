package my.company;
import java.io.*;
class tech_radhe
{
    void sub(){
        int a=50;
        int b=25;
        int c=a-b;
        System.out.println(c);
    }
}
class dharam extends tech_radhe
{

}
public class online1 {
    public static void main(String[] args) {
        dharam tech=new dharam();
        tech.sub();
    }
}
