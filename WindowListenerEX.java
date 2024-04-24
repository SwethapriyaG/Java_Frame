//program to demonstrate window listener
import java.awt.*;
import java.awt.event.*;
 
class WindowListenerEx
{
	public static void main(String ar[])
	{
		//step-1: Add the component
		Frame f = new Frame("WindowListener Example");
		f.setSize(400,300);
		f.setVisible(true);
		
		//Step-2: add the listener
		f.addWindowListener(new MyListener());
		
	}
}	

class MyListener implements WindowListener
{
	//methods 
	public void windowActivated(WindowEvent e){System.out.println("Activated");}
	public void windowClosed(WindowEvent e){System.out.println("Closed");}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){System.out.println("Deactivated");}
	public void windowDeiconified(WindowEvent e){System.out.println("Deiconified");}
	
	public void windowIconified(WindowEvent e){System.out.println("Iconified");}
	public void windowOpened(WindowEvent e){System.out.println("Opened");}
}	
	
	