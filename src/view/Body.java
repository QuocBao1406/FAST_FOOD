package view;

import javax.swing.JPanel;

import view.pages.Customer_Management;
import view.pages.Employee_Management;
import view.pages.Food_Management;
import view.pages.Overview_Management;
import view.pages.Revenue_Management;
import view.pages.Sell_Management;
import view.pages.Statistical_Management;
import view.pages.Store_Management;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;

public class Body extends JPanel{
	private Customer_Management customer;
	private Store_Management store;
	private Sell_Management sell;
	private Employee_Management employee;
	private Food_Management food;
	private Overview_Management overview;
	private Revenue_Management revenue;
	private Component statistical;
	private CardLayout cardlayout;

	public Body() {
		setSize(1250, 820);
		setLayout(new CardLayout(0, 0));
		
		store = new Store_Management();
		add(store);
		
		sell = new Sell_Management();
		add(sell);
		
		employee = new Employee_Management();
		add(employee);
		
		food = new Food_Management();
		add(food);
		
		customer = new Customer_Management();
		add(customer);
		
		overview = new Overview_Management();
		add(overview);
		
		revenue = new Revenue_Management();
		add(revenue);
		
		statistical = new Statistical_Management();
		add(statistical);
	}
	
	public CardLayout getCardLayout() {
		return cardlayout;
	}
}
