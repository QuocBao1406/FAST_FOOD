package view.pages;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sell_Management extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
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
		scrollPane.setBounds(10, 88, 860, 692);
		scrollPane.setBackground(new Color(225, 253, 241));
		scrollPane.setOpaque(true);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 252, 251));
		panel.setBounds(882, 88, 340, 692);
		add(panel);
		panel.setLayout(null);
		
		JLabel lb_reset = new JLabel("Đặt Lại");
		lb_reset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_reset.setBackground(new Color(0, 181, 176));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_reset.setBackground(new Color(87, 230, 255));
			}
		});
		lb_reset.setBackground(new Color(87, 230, 255));
		lb_reset.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_reset.setForeground(new Color(255, 255, 255));
		lb_reset.setHorizontalAlignment(SwingConstants.CENTER);
		lb_reset.setBounds(10, 627, 150, 55);
		lb_reset.setOpaque(true);
		panel.add(lb_reset);
		
		JLabel lb_pay = new JLabel("Thanh Toán");
		lb_pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_pay.setBackground(new Color(41, 154, 29));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_pay.setBackground(new Color(124, 242, 121));
			}
		});
		lb_pay.setBackground(new Color(124, 242, 121));
		lb_pay.setForeground(new Color(255, 255, 255));
		lb_pay.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_pay.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pay.setBounds(170, 627, 160, 55);
		lb_pay.setOpaque(true);
		panel.add(lb_pay);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(231, 254, 250));
		panel_1.setBounds(10, 433, 320, 184);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã Khách Hàng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 140, 29);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 10, 150, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel Hạng = new JLabel("Hạng");
		Hạng.setHorizontalAlignment(SwingConstants.CENTER);
		Hạng.setFont(new Font("Tahoma", Font.BOLD, 17));
		Hạng.setBounds(10, 55, 140, 29);
		panel_1.add(Hạng);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(160, 55, 150, 29);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mức Giảm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(10, 100, 140, 29);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(160, 100, 150, 29);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(160, 145, 150, 29);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tổng Tiền");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 145, 140, 29);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thanh Toán Hóa Đơn");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(249, 243, 250));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 10, 320, 29);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 49, 320, 374);
		panel.add(scrollPane_1);
		
		table = new JTable();
		Font headerFont = new Font("Arial", Font.BOLD, 10);
		table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 30));
		table.getTableHeader().setFont(headerFont);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"T\u00EAn M\u00F3n", "S\u1ED1 L\u01B0\u1EE3ng", "Gi\u00E1"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(140);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		scrollPane_1.setViewportView(table);
	}
}
