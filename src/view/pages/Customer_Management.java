package view.pages;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Customer_Management extends JPanel{
	public Customer_Management() {
		setBackground(new Color(255, 242, 189));
		setSize(1250, 820);
		setLayout(null);
		
		JLabel lb_title = new JLabel("");
		lb_title.setIcon(new ImageIcon(Customer_Management.class.getResource("/images/title_logo.png")));
		lb_title.setBounds(372, 10, 500, 80);
		add(lb_title);
	}
}
