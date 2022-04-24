package my.company.grapic_8;

import java.awt.*;

public class graphic_8_3_2 {
    public static void main(String[] args) {
        Frame fr=new Frame("Button");
        fr.setSize(400,300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        Button b1=new Button("OK");
        Button b2=new Button("CANCEL");
        fr.add(b1);
        fr.add(b2);


    }
}
