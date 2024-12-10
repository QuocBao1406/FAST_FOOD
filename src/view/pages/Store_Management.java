package view.pages;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Store_Management extends JPanel{
	public Store_Management() {
		setBackground(new Color(255, 242, 189));
		setSize(1250, 820);
		setLayout(null);
		
		JLabel lb_title = new JLabel("");
		lb_title.setIcon(new ImageIcon(Store_Management.class.getResource("/images/title_logo.png")));
		lb_title.setBounds(372, 10, 500, 80);
		add(lb_title);
	}
}
