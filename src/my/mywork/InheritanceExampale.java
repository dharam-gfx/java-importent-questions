package my.mywork;

class Phone{
   public  Phone(String call){
       System.out.println("I am simple phone constactor");
       System.out.println(call);
    }
    public void call(){
        System.out.println("i am method 1");
    }
}
class SmartPhone extends Phone{

    public SmartPhone( String call,String videoCall) {
        super(call);
        System.out.println("Im Smart phone constactor");
        System.out.println(videoCall);
    }
    public void Vcall(){
        System.out.println("i am method 2");
    }


}

public class InheritanceExampale {
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone("Calling....","video Ringing.........");
        phone.call();
        phone.Vcall();



    }
}
