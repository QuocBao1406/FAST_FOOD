package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SideBar extends JPanel{
	private JLabel lb_store_management;
	private JLabel lb_sell;
	private JLabel lb_empolyee_management;
	private JLabel lb_food_management;
	private JLabel lb_customer;
	private JLabel lb_overview;
	private JLabel lb_revenue;
	private JLabel lb_statistical;
	
	private Body body;

	public SideBar() {
		setForeground(new Color(254, 210, 97));
		setBackground(new Color(255, 128, 0));
		setSize(300, 820);
		setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(SideBar.class.getResource("/images/logo.png")));
		logo.setBounds(47, 10, 200, 200);
		add(logo);
		
		lb_store_management = new JLabel("QUẢN LÝ CỬA HÀNG");
		lb_store_management.setIcon(new ImageIcon(SideBar.class.getResource("/images/store.png")));
		lb_store_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_store_management.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_store_management.setBackground(new Color(203, 121, 10));
			}
		});
		lb_store_management.setForeground(new Color(255, 255, 255));
		lb_store_management.setOpaque(true);
		lb_store_management.setBackground(new Color(249, 194, 121));
		lb_store_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_management.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_store_management.setBounds(0, 220, 300, 60);
		add(lb_store_management);
		
		lb_sell = new JLabel("BÁN HÀNG");
		lb_sell.setIcon(new ImageIcon(SideBar.class.getResource("/images/sell.png")));
		lb_sell.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_sell.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_sell.setBackground(new Color(203, 121, 10));
			}
		});
		lb_sell.setOpaque(true);
		lb_sell.setHorizontalAlignment(SwingConstants.CENTER);
		lb_sell.setForeground(Color.WHITE);
		lb_sell.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_sell.setBackground(new Color(249, 194, 121));
		lb_sell.setBounds(0, 290, 300, 60);
		add(lb_sell);
		
		lb_empolyee_management = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_empolyee_management.setIcon(new ImageIcon(SideBar.class.getResource("/images/employee.png")));
		lb_empolyee_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_empolyee_management.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_empolyee_management.setBackground(new Color(203, 121, 10));
			}
		});
		lb_empolyee_management.setOpaque(true);
		lb_empolyee_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_empolyee_management.setForeground(Color.WHITE);
		lb_empolyee_management.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_empolyee_management.setBackground(new Color(249, 194, 121));
		lb_empolyee_management.setBounds(0, 360, 300, 60);
		add(lb_empolyee_management);
		
		lb_food_management = new JLabel("QUẢN LÝ ĐỒ ĂN");
		lb_food_management.setIcon(new ImageIcon(SideBar.class.getResource("/images/food.png")));
		lb_food_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_food_management.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_food_management.setBackground(new Color(203, 121, 10));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				body.getCardLayout().show(body, "food");
			}
		});
		lb_food_management.setOpaque(true);
		lb_food_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_food_management.setForeground(Color.WHITE);
		lb_food_management.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_food_management.setBackground(new Color(249, 194, 121));
		lb_food_management.setBounds(0, 430, 300, 60);
		add(lb_food_management);
		
		lb_customer = new JLabel("KHÁCH HÀNG");
		lb_customer.setIcon(new ImageIcon(SideBar.class.getResource("/images/customers.png")));
		lb_customer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_customer.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_customer.setBackground(new Color(203, 121, 10));
			}
		});
		lb_customer.setOpaque(true);
		lb_customer.setHorizontalAlignment(SwingConstants.CENTER);
		lb_customer.setForeground(Color.WHITE);
		lb_customer.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_customer.setBackground(new Color(249, 194, 121));
		lb_customer.setBounds(0, 500, 300, 60);
		add(lb_customer);
		
		lb_overview = new JLabel("TỔNG QUAN");
		lb_overview.setIcon(new ImageIcon(SideBar.class.getResource("/images/overview.png")));
		lb_overview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_overview.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_overview.setBackground(new Color(203, 121, 10));
			}
		});
		lb_overview.setOpaque(true);
		lb_overview.setHorizontalAlignment(SwingConstants.CENTER);
		lb_overview.setForeground(Color.WHITE);
		lb_overview.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_overview.setBackground(new Color(249, 194, 121));
		lb_overview.setBounds(0, 570, 300, 60);
		add(lb_overview);
		
		lb_revenue = new JLabel("DOANH THU");
		lb_revenue.setIcon(new ImageIcon(SideBar.class.getResource("/images/revenue.png")));
		lb_revenue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_revenue.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_revenue.setBackground(new Color(203, 121, 10));
			}
		});
		lb_revenue.setOpaque(true);
		lb_revenue.setHorizontalAlignment(SwingConstants.CENTER);
		lb_revenue.setForeground(Color.WHITE);
		lb_revenue.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_revenue.setBackground(new Color(249, 194, 121));
		lb_revenue.setBounds(0, 640, 300, 60);
		add(lb_revenue);
		
		lb_statistical = new JLabel("THỐNG KÊ");
		lb_statistical.setIcon(new ImageIcon(SideBar.class.getResource("/images/statistical.png")));
		lb_statistical.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lb_statistical.setBackground(new Color(249, 194, 121));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_statistical.setBackground(new Color(203, 121, 10));
			}
		});
		lb_statistical.setOpaque(true);
		lb_statistical.setHorizontalAlignment(SwingConstants.CENTER);
		lb_statistical.setForeground(Color.WHITE);
		lb_statistical.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_statistical.setBackground(new Color(249, 194, 121));
		lb_statistical.setBounds(0, 710, 300, 60);
		add(lb_statistical);
	}
}
