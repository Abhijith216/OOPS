import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener{
	JLabel l,l2;
	JTextField t,t2;
	JButton b,b2;
	
	
	test()
	{
		JFrame f = new JFrame("Login Page");
		
		l = new JLabel("username");
		l2 = new JLabel("password");
		
		t = new JTextField(16);
		t2 = new JTextField(16);
		b = new JButton("Submit");
		b2 = new JButton("Cancel");
		
		JPanel p = new JPanel();
	
		p.add(l);
		p.add(t);
		p.add(l2);
		p.add(t2);
		p.add(b);
		p.add(b2);
		b.addActionListener(this);
		
		f.add(p);
		
		f.setSize(300,200);
		
		f.show();
	}
	//If the button is pressed
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("submit login"))
		{
		//set the text of the label to the text of the field
		l.setText(t.getText());
		//set the text of the field to the blank
		t.setText(" ");
		}
	}
	public static void main(String args[])
	{
	test t = new test();
	}
}
