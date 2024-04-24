//program to demonstrate borderlayout
import java.awt.*;

class BorderlayoutEx extends Frame
{
	public static void main(String ar[])
	{
		BorderlayoutEx f = new BorderlayoutEx();
		f.setSize(400,500);
		f.setVisible(true);
		f.setBackground(Color.pink); 
		
		//setting layout
		BorderLayout fl = new BorderLayout(10,20);
		
		//setting layout to the frame
		f.setLayout(fl);
		
		//create a button
		Button b1 = new Button("Red");
		
		//add this button to the frame
		f.add(b1,BorderLayout.EAST);
		
		Button b2 = new Button("Blue");
		f.add(b2,BorderLayout.WEST);
		
		Button b3 = new Button("Green");
		f.add(b3,BorderLayout.NORTH);
		
		Button b4 = new Button("Violet");
		f.add(b4,BorderLayout.SOUTH);
		
		Button b5 = new Button("Indigo");
		f.add(b5,BorderLayout.CENTER);
	}
}	
	