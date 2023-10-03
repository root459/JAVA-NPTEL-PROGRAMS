import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorld extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World", 10,5);
//10,5 is the coordinate not the size
    }
}