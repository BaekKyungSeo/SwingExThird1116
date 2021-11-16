package edu.swingexThird;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

class Sub extends JFrame implements ActionListener
{
	Container con = null;
	FlowLayout fl = new FlowLayout();
	JLabel lb = new JLabel("ID : ", JLabel.RIGHT);
	JTextField tf = new JTextField(10);
	JDialog dlg = new JDialog(this, "확인");
	Container dlgcon = null;
	JLabel dlglb = new JLabel("사용할수 있는 ID입니다", 
									JLabel.CENTER);
	BorderLayout dlgbl = new BorderLayout();
	
	public Sub()
	{
		this.init();
		this.start();
	}
	
	public void init()
	{
		con = this.getContentPane();
		this.setLayout(fl);
		con.add(lb);
		con.add(tf);
		
		dlgcon = dlg.getContentPane();
		dlgcon.setLayout(dlgbl);
		dlglb.setBorder(new BevelBorder(BevelBorder.RAISED));
		dlgcon.add("Center", dlglb);
		dlg.setSize(200, 150);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	public void start()
	{
		
	}
	
	
	//Ctrl + Shift + 'o'
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class SwingExThird1116 {

	public static void main(String[] args) {
		Sub ob = new Sub();
	}

}
