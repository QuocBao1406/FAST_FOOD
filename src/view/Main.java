package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private SideBar sidebar;
	private Body body;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-6, 1, 1550, 820);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("fillx, filly", "0[300!]0[fill, 100%]0", "0[fill]0"));

		sidebar = new SideBar();
		contentPane.add(sidebar, "width 300:300:300");
		
		body = new Body();
		contentPane.add(body, "width 1240:1240:1240");
	}

}
