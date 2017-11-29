package project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLayeredPane;
import java.awt.ComponentOrientation;

public class asd {

	private JFrame frame;
	protected JTable table;
	private JTextField txt_num;
	static Object[][] data;
	private JTable table_1;
	private JTextField txt_num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asd window = new asd();
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
	public asd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 108, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, tabbedPane);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		sl_panel.putConstraint(SpringLayout.NORTH, layeredPane, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, layeredPane, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, layeredPane, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, layeredPane, 754, SpringLayout.WEST, panel);
		panel.add(layeredPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 744, 78);
		layeredPane.setLayout(null);
		layeredPane.setLayer(panel_4, 1);
		layeredPane.add(panel_4);
		
		JLabel lblBbb = new JLabel("bbb");
		panel_4.add(lblBbb);
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBounds(0, 0, 744, 78);
		layeredPane.add(panel_3);
		sl_panel.putConstraint(SpringLayout.NORTH, panel_3, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, panel_3, 98, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, panel_3, 10, SpringLayout.WEST, panel);
		
		JLabel lblAaa = new JLabel("aaa");
		panel_3.add(lblAaa);
		frame.getContentPane().add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		tabbedPane.addTab("클래스 조회", null, scrollPane, null);

		table = new JTable();
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", "", "", "", "", "", "", "", "", ""},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\uD559\uBC88", "\uC774\uB984", "\uC5F0\uB77D\uCC98", "\uC8FC\uC18C", "\uAD6D\uC5B4", "\uC601\uC5B4", "\uC218\uD559", "Java", "Android", "\uCD1D\uC810", "\uD3C9\uADE0"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(48);
		table.getColumnModel().getColumn(2).setPreferredWidth(84);
		table.getColumnModel().getColumn(3).setPreferredWidth(320);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setPreferredWidth(50);
		table.getColumnModel().getColumn(9).setPreferredWidth(50);
		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setRowHeaderView(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("\uC804\uCCB4 \uC870\uD68C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testasd ta = new testasd();
				try {
					data = ta.classlist("0000");
					table.setModel(new DefaultTableModel(data,
							new String[] {
								"학번", "이름", "연락처", "주소", "국어", "영어", "수학", "Java", "Android", "총점", "평균"
							}));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_1.add(lblNewLabel_1);
		
		txt_num = new JTextField();
		txt_num.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txt_num.setText("");
			}
		});
		txt_num.setToolTipText("\uD559\uB144/\uBC18\uC744 \uC785\uB825\uD558\uC138\uC694");
		panel_1.add(txt_num);
		txt_num.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uD074\uB798\uC2A4 \uC870\uD68C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testasd ta = new testasd();
				try {
					data = ta.classlist(txt_num.getText());
					table.setModel(new DefaultTableModel(data,
							new String[] {
								"학번", "이름", "연락처", "주소", "국어", "영어", "수학", "Java", "Android", "총점", "평균"
							}));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("과목 조회", null, scrollPane_1, null);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setRowHeaderView(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("\uC804\uCCB4 \uC870\uD68C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testasd ta = new testasd();
				try {
					data = ta.sublist("korean", "0000");
					table_1.setModel(new DefaultTableModel(data,
							new String[] {
								"학번", "이름", "korean"
							}));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_2.add(button);
		
		txt_num2 = new JTextField();
		panel_2.add(txt_num2);
		txt_num2.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\uD074\uB798\uC2A4 \uC870\uD68C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testasd ta = new testasd();
				try {
					data = ta.sublist("korean", txt_num2.getText());
					table_1.setModel(new DefaultTableModel(data,
							new String[] {
								"학번", "이름", "korean"
							}));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC218\uC815");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test1 test1 = new test1();
				data = test1.input(table_1);
				try {
					test1.up(data, "korean");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel_2.add(lblNewLabel_5);
		panel_2.add(btnNewButton_4);
		
		table_1 = new JTable();
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uD559\uBC88", "\uC774\uB984", "\uACFC\uBAA9"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(50);
		scrollPane_1.setViewportView(table_1);
	}
}
