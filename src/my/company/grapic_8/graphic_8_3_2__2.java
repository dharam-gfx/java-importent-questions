package my.company.grapic_8;

import java.awt.*;

public class graphic_8_3_2__2 {
    public static void main(String[] args) {
        Frame fr=new Frame("Display Buton List");
        fr.setSize(400,300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        Button btn[]=new Button[5];

        String name[]={"apple","Orange","Banana","Grapes"};
        for (int i=0;i<5;i++){
            btn[i]=new Button(""+name[i]);
            fr.add(btn[i]);
        }
    }
}
