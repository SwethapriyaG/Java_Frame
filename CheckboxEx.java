//program to demonstrate checkbox in awt
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class CheckboxEx extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,cg1,cg2,cg3;
	
	
	CheckboxEx()
	{
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);
		
		CheckboxGroup cbg = new CheckboxGroup();
		
		cg1 = new Checkbox("Male",false,cbg);
		this.add(cg1);
		cg1.addItemListener(this);
		
		cg2 = new Checkbox("Female",false,cbg);
		this.add(cg2);
		cg2.addItemListener(this);
		
		cg3 = new Checkbox("Others",false,cbg);
		this.add(cg3);
		cg3.addItemListener(this);
		
		
		
		 c1 = new Checkbox("English");
		this.add(c1);
		c1.addItemListener(this);
		
		c2 = new Checkbox("Swedish");
		this.add(c2);
		c2.addItemListener(this);
		
		c3 = new Checkbox("Hindi");
		this.add(c3);
		c3.addItemListener(this);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("You have selected c1: "+c1.getState(),10,100);
		g.drawString("You have selected c2: "+c2.getState(),10,150);
		g.drawString("You have selected c2: "+c3.getState(),10,200);
	}	
	
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	
	public static void main(String ar[])
	{
		CheckboxEx f = new CheckboxEx();
		f.setSize(400,300);
		f.setVisible(true);
		
	}
}	