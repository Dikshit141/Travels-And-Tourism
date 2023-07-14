package travel.management.system;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{

	Paytm(){
		setBounds(400,200,800,600);
		
		JEditorPane pane = new JEditorPane();
		pane.setEditable(false);
		
		try {
			pane.setPage("https://paytm.com/rent-payment");
			pane.setBounds(getMaximizedBounds());
		}catch(Exception e) {
			pane.setContentType("text/html");
			pane.setText("<html>Could not Load, Error 404</html>");
		}
		
	  JScrollPane sp = new JScrollPane(pane);
	  getContentPane().add(sp);
	  
	  JLabel text = new JLabel("Don't Do Payment Here , It's just a Sample Project.");
		text.setBounds(25,10,500,70);
		text.setForeground(Color.RED);
		text.setFont(new Font("Raleway",Font.BOLD,20));
		pane.add(text);
		
	  JButton back = new JButton("Back");
	  back.setBounds(610,20,80,40);
	  back.addActionListener(this);
	  pane.add(back);
	  
	  setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Payment();
	}
	
	public static void main(String[] args) {
		new Paytm();
	}
}
