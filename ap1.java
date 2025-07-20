import java.awt.*;
import java.applet.*;
//<applet code=ap1 width=200 height=300></applet>
public class ap1 extends Applet
{
	String msg="";
	public void init()
	{
		msg="Hello world";
	}

	public void start()
	{
		msg=msg+",Welcome to Scalar Topics";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
        public void stop(){
                System.out.println("stop");
        }

}
