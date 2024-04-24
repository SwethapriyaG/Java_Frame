//program to demonstrate Graphics
import java.awt.*;
import java.lang.*;
class GraphicsEx extends Frame
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(500, 400, 300, 540);
		g.setColor(Color.blue);
		g.fillOval(40, 100, 350, 350);
		g.setColor(Color.green);
		//g.drawRect(40, 40, 200, 150);
		//g.drawOval(150, 150, 100, 110);
		
		Font fnt = new Font("Arial", Font.BOLD,40);
		g.setFont(fnt);
		g.drawString("Hello Java", 130, 250);
	}
	
	public static void main(String ar[])
	{
		GraphicsEx f = new GraphicsEx();
		f.setSize(1500,1400);
		f.setVisible(true);
	}
}	