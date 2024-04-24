//program to demonstrate cardlayout
import java.awt.*;

class CardlayoutEx extends Frame
{
	public static void main(String ar[])
	{
		CardlayoutEx f = new CardlayoutEx();
		f.setSize(400,500);
		f.setVisible(true);
		f.setBackground(Color.pink); 
		
		//setting layout
		CardLayout cl = new CardLayout();
		
		//setting layout to the frame
		f.setLayout(cl);
		
		//create a button
		Button b1 = new Button("Red");
		
		//add this button to the frame
		f.add("Red",b1);
		
		Button b2 = new Button("Blue");
		f.add("Blue",b2);
		
		Button b3 = new Button("Green");
		f.add("Green",b3);
		
		Button b4 = new Button("Violet");
		f.add("Violet",b4);
		
		Button b5 = new Button("Indigo");
		f.add("Indigo",b5);
		
		// cl.next(f);
		// cl.next(f);
		
		// cl.last(f);
		// cl.previous(f);
		cl.show(f,"Green");
		
	}
}	
	