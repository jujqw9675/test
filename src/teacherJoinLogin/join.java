package teacherJoinLogin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

import oracle.net.aso.g;

import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class join {

	public JFrame frame;
	private JTextField name;
	private JTextField birth;
	private JTextField pass;
	private JTextField passCheck;
	private JTextField id;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					join window = new join();
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
	public join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uD68C\uC6D0\uAC00\uC785");
		frame.setBounds(100, 100, 450, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 289, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel name41213 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.NORTH, name41213, 29, SpringLayout.NORTH, panel);
		name41213.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(name41213);
		
		JLabel b = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		sl_panel.putConstraint(SpringLayout.NORTH, b, 22, SpringLayout.SOUTH, name41213);
		sl_panel.putConstraint(SpringLayout.EAST, b, 0, SpringLayout.EAST, name41213);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(b);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, b);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -18, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.EAST, name41213, 0, SpringLayout.EAST, lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("\uACFC\uBAA9");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 213, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -24, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel_6);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_6, -291, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_6);
		
		name = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, name, -3, SpringLayout.NORTH, name41213);
		panel.add(name);
		name.setColumns(10);
		
		birth = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, birth, 30, SpringLayout.EAST, b);
		sl_panel.putConstraint(SpringLayout.WEST, name, 0, SpringLayout.WEST, birth);
		sl_panel.putConstraint(SpringLayout.NORTH, birth, -3, SpringLayout.NORTH, b);
		panel.add(birth);
		birth.setColumns(10);
		
		pass = new JTextField();
		pass.setToolTipText("5\uC790\uB9AC \uC774\uC0C1\uC73C\uB85C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		sl_panel.putConstraint(SpringLayout.NORTH, pass, -3, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, pass, 30, SpringLayout.EAST, lblNewLabel_2);
		panel.add(pass);
		pass.setColumns(10);
		
		passCheck = new JTextField();
		passCheck.setToolTipText("\uBE44\uBC00\uBC88\uD638\uC640 \uB3D9\uC77C\uD558\uAC8C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		sl_panel.putConstraint(SpringLayout.NORTH, passCheck, -3, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, passCheck, 30, SpringLayout.EAST, lblNewLabel_3);
		panel.add(passCheck);
		passCheck.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 15, SpringLayout.SOUTH, b);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, name41213);
		panel.add(lblNewLabel);
		
		id = new JTextField();
		sl_panel.putConstraint(SpringLayout.SOUTH, id, -10, SpringLayout.NORTH, pass);
		sl_panel.putConstraint(SpringLayout.WEST, id, 153, SpringLayout.WEST, panel);
		panel.add(id);
		id.setColumns(10);
		
		JComboBox subject = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, subject, -3, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel.putConstraint(SpringLayout.WEST, subject, 0, SpringLayout.WEST, name);
		subject.setModel(new DefaultComboBoxModel(new String[] {"\uACFC\uBAA9\uC744\uC120\uD0DD\uD558\uC138\uC694", "\uAD6D\uC5B4", "\uC601\uC5B4", "\uC218\uD559", "\uC790\uBC14", "\uC548\uB4DC\uB85C\uC774\uB4DC"}));
		panel.add(subject);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -99, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F4\uB2F9\uD558\uB294 \uD559\uB144 \uBC18\uC744 \uC120\uD0DD\uD558\uC138\uC694.");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 115, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("\uD559\uB144");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("\uBC18");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_7, 68, SpringLayout.EAST, lblNewLabel_4);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_7, -52, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, lblNewLabel_7);
		panel_1.add(lblNewLabel_7);
		
		JComboBox grade = new JComboBox();
		grade.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		sl_panel_1.putConstraint(SpringLayout.NORTH, grade, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, grade, 6, SpringLayout.EAST, lblNewLabel_4);
		panel_1.add(grade);
		
		JComboBox myc = new JComboBox();
		myc.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2"}));
		sl_panel_1.putConstraint(SpringLayout.WEST, myc, 6, SpringLayout.EAST, lblNewLabel_7);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, myc, 0, SpringLayout.SOUTH, grade);
		panel_1.add(myc);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -35, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uB2F4\uC784\uC774\uC2DC\uB77C\uBA74 \uCCB4\uD06C\uD574\uC8FC\uC138\uC694");
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 119, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox, -10, SpringLayout.SOUTH, panel);
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			int cnt = 0;
			public void itemStateChanged(ItemEvent arg0) {
				cnt++;
				if(cnt%2==1) panel_1.setVisible(true);
				else if(cnt%2 ==0) panel_1.setVisible(false);
			}
		});
		panel.add(chckbxNewCheckBox);
		
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login login = new login();
				login.frame.setVisible(true);
				frame.dispose();
				
			
			}
		});
		panel_2.add(cancel);
		
		JButton joinper = new JButton("\uD68C\uC6D0\uAC00\uC785\uC644\uB8CC");
		joinper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				teacherJoin join = new teacherJoin();
				
				try {
					//비밀번호가 일치한지 판단
					if (pass.getText().equals(passCheck.getText()) && pass.getText().length() > 4) {
						join.teacherJoin(name.getText(), birth.getText(), id.getText(), pass.getText(), passCheck.getText(), 
										("0"+grade.getSelectedIndex()+"0"+myc.getSelectedIndex()+"9"+subject.getSelectedIndex()));
					} else {
						new dialog("비밀 번호는 5자리 이상이여야 합니다.");
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.dispose();
				
			}
		});
		sl_panel_2.putConstraint(SpringLayout.NORTH, joinper, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, joinper, 213, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, cancel, 0, SpringLayout.NORTH, joinper);
		sl_panel_2.putConstraint(SpringLayout.EAST, cancel, -36, SpringLayout.WEST, joinper);
		panel_2.add(joinper);
	}
}

