package teacherJoinLogin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import teacherJoinLogin.teacherLogin;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	public JFrame frame;
	private JTextField id;
	private JTextField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 316, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -46, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 294, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		id = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, id);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, -45, SpringLayout.WEST, id);
		sl_panel.putConstraint(SpringLayout.EAST, id, -53, SpringLayout.EAST, panel);
		panel.add(id);
		id.setColumns(10);
		
		pass = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, pass, 67, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, pass);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, -19, SpringLayout.WEST, pass);
		sl_panel.putConstraint(SpringLayout.SOUTH, id, -18, SpringLayout.NORTH, pass);
		sl_panel.putConstraint(SpringLayout.EAST, pass, 0, SpringLayout.EAST, id);
		panel.add(pass);
		pass.setColumns(10);
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				join join = new join();
				join.frame.setVisible(true);
				frame.dispose();
	
				
			}
		});
		panel_1.add(join);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherLogin login = new teacherLogin(); 
				
				try {
					login.teacherLogin(id.getText(), pass.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				frame.dispose();
				
				
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, login, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, login, 162, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, join, 0, SpringLayout.NORTH, login);
		sl_panel_1.putConstraint(SpringLayout.EAST, join, -40, SpringLayout.WEST, login);
		panel_1.add(login);
	}
}
