//program to demonstrate Button in awt

import java.awt.*;
import java.awt.event.*;

class ButtonEx extends Frame implements ActionListener
{
	ButtonEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		
		//step1: create the component
		Button b1 = new Button("Red");
		
		//add component to the container frame
		this.add(b1);
		
		//add listener to the component
		b1.addActionListener(this);
		
		Button b3 = new Button("Green");
		this.add(b3);
		b3.addActionListener(this);
		
		Button b2 = new Button("Blue");
		this.add(b2);
		b2.addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent e)
	{
		String bname = e.getActionCommand();
		if(bname.equals("Red"))
			this.setBackground(Color.red);
		
		if(bname.equals("Blue"))
			this.setBackground(Color.blue);
		
			
		if(bname.equals("Green"))
			this.setBackground(Color.green);
			
	}	
	
	public static void main(String ar[])
	{
		ButtonEx f = new ButtonEx();
		f.setSize(400,300);
		f.setVisible(true);
		
	}
}	
