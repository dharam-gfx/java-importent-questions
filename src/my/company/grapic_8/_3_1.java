package my.company.grapic_8;

import java.awt.*;

public class _3_1 {
    public static void main(String[] args) {
       Frame fr=new Frame("Display Lable");
       fr.setSize(400,500);
       fr.setLayout(new FlowLayout());
       fr.setVisible(true);
       Label l1=new Label("ok");
       Label l2=new Label("Cancel");
       fr.add(l1);
       fr.add(l2);


    }
}
