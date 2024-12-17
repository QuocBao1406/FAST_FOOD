package view.pages;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Sell_Management extends JPanel{
	public Sell_Management() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(new Color(255, 242, 189));
		setSize(1250, 820);
		setLayout(null);
		
		JLabel lb_title = new JLabel("");
		lb_title.setIcon(new ImageIcon(Sell_Management.class.getResource("/images/title_logo.png")));
		lb_title.setBounds(372, 10, 500, 80);
		add(lb_title);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 862, 680);
		add(scrollPane);
	}
}
