//program to demonstrate flowlayout
import java.awt.*;

class FlowlayoutEx extends Frame
{
	public static void main(String ar[])
	{
		FlowlayoutEx f = new FlowlayoutEx();
		f.setSize(400,500);
		f.setVisible(true);
		f.setBackground(Color.pink);
		
		//setting layout
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,20);
		
		//setting layout to the frame
		f.setLayout(fl);
		
		//create a button
		Button b1 = new Button("Red");
		
		//add this button to the frame
		f.add(b1);
		
		Button b2 = new Button("Blue");
		f.add(b2);
		
		Button b3 = new Button("Green");
		f.add(b3);
		
		Button b4 = new Button("Violet");
		f.add(b4);
		
		Button b5 = new Button("Indigo");
		f.add(b5);
	}
}	
	