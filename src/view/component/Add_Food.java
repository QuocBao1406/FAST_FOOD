package view.component;

import java.awt.Color;
import java.awt.Dialog;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Food extends JPanel{
	private JDialog dialog;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public Add_Food(JDialog dialog) {
		this.dialog = dialog;
		
		setForeground(new Color(128, 0, 0));
		setBackground(new Color(255, 236, 206));
		setSize(1000, 500);
		setLayout(null);
		
		JLabel lblThmn = new JLabel("THÊM ĐỒ ĂN");
		lblThmn.setIcon(new ImageIcon(Add_Food.class.getResource("/images/add_food.png")));
		lblThmn.setForeground(new Color(128, 64, 64));
		lblThmn.setHorizontalAlignment(SwingConstants.CENTER);
		lblThmn.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblThmn.setBounds(244, 34, 409, 53);
		add(lblThmn);
		
		JLabel lb_anh = new JLabel("");
		lb_anh.setIcon(new ImageIcon(Add_Food.class.getResource("/images/icon_image.png")));
		lb_anh.setBounds(664, 98, 250, 250);
		add(lb_anh);
		
		JLabel lblTnMn = new JLabel("Tên Món Ăn");
		lblTnMn.setForeground(new Color(128, 0, 0));
		lblTnMn.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTnMn.setBounds(78, 182, 165, 30);
		add(lblTnMn);
		
		JLabel lblThLoi = new JLabel("Loại");
		lblThLoi.setForeground(new Color(128, 0, 0));
		lblThLoi.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblThLoi.setBounds(78, 242, 145, 30);
		add(lblThLoi);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Tahoma", Font.BOLD, 28));
		textField.setColumns(10);
		textField.setBounds(259, 181, 353, 40);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		textField_1.setColumns(10);
		textField_1.setBounds(259, 302, 353, 40);
		add(textField_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Add_Food.class.getResource("/images/camera.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(694, 346, 200, 35);
		add(btnNewButton);
		
		JButton bt_them = new JButton("THÊM");
		bt_them.setIcon(new ImageIcon(Add_Food.class.getResource("/images/add.png")));
		bt_them.setFont(new Font("Tahoma", Font.BOLD, 28));
		bt_them.setBounds(316, 378, 250, 60);
		add(bt_them);
		
		JLabel lblnGi = new JLabel("Đơn giá");
		lblnGi.setForeground(new Color(128, 0, 0));
		lblnGi.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblnGi.setBounds(78, 302, 145, 30);
		add(lblnGi);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		textField_2.setColumns(10);
		textField_2.setBounds(259, 117, 353, 40);
		add(textField_2);
		
		JLabel lblMMn = new JLabel("Mã Món Ăn");
		lblMMn.setForeground(new Color(128, 0, 0));
		lblMMn.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblMMn.setBounds(78, 122, 165, 30);
		add(lblMMn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(259, 242, 353, 40);
		add(scrollPane);
	}
}
