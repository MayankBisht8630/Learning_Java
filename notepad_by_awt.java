import java.awt.event.*;
import java.awt.*;
public class notepad_by_awt extends Frame
{
    public static void main(String args[])
    {
       Frame f = new Frame ();
       f.setVisible(true);
       f.setTitle("NotePad");
       f.setSize(400,400);
       TextArea ta = new TextArea(5,50);
       f.add(ta);

       MenuBar mb = new MenuBar();
       f.setMenuBar(mb);
       Menu m = new Menu("Files");
       MenuItem i1,i2;
       m.add(new MenuItem("new"));
       m.add(new MenuItem("open"));
       mb.add(m);

       Menu m1 = new Menu("Save");
       mb.add(m1);
       Menu m2 = new Menu("Edit");
       mb.add(m2);




    }
}
