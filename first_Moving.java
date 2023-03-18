import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class first_Moving extends JPanel
{
    int x = 0;
    int y = 100;
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D gd = (Graphics2D)g; // cascating graphics to graphics 2d
        gd.setFont(new Font("Arial",Font.BOLD,18));
        gd.setColor(Color.RED);
        gd.drawString(" This is Mayank " ,x, y);
            try
            {
                Thread.sleep(100); // sleep method throws interrupted exception as we interrupt the normal flow of the programme
                                        // so we put it in try and catch block . hum sleep method se thread ko thoi dher ke liye rok sakte hai
                x += 5;// agar hum sidhe he yeh line likhte toh speed of he text is very fast so we use thread.sleep method to control the speed
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            if (x > getWidth())
            {
                x = 0;
            }
            repaint();
    }

    public static void main(String[] args)
    {
        JFrame jf = new JFrame("Main Image ");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new first_Moving());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}

/*
threads are the independent path of execution can be run parallel
combination of threads are called as process

*/
