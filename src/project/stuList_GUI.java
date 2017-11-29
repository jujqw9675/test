package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.List;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import studentDataDBUp.stuinfoDBUp;
import teacherJoinLogin.login;

import java.awt.Scrollbar;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class stuList_GUI {
	private static String[][] ob;
	public JFrame frame;
	private JTextField text_search;
	private JTable tb_allList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stuList_GUI window = new stuList_GUI();
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
	public stuList_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC131\uC801 \uC870\uD68C");
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 881, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel1, 396, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel1, 9, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel1, -10, SpringLayout.SOUTH, frame.getContentPane());
		panel1.setBackground(new Color(255, 250, 250));
		frame.getContentPane().add(panel1);

		JPanel panel2 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel1, -20, SpringLayout.WEST, panel2);
		panel1.setLayout(new GridLayout(5, 1, 0, 0));

		JButton btn_mycScore = new JButton("\uC131\uC801 \uC870\uD68C");
		btn_mycScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				stuinfo_add ta = new stuinfo_add();
				try {
					Object[][] data = ta.classlist("0000");
					tb_allList.setModel(new DefaultTableModel(data, new String[] { "학번", "이름", "전화번호", "주소", "국어", "영어",
							"수학", "Java", "Android", "Total", "Average" }));
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		JLabel lblNewLabel = new JLabel("\uC6B0\uB9AC\uBC18");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
		panel1.add(lblNewLabel);
		panel1.add(btn_mycScore);
		springLayout.putConstraint(SpringLayout.SOUTH, panel2, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel2, 280, SpringLayout.WEST, frame.getContentPane());
		panel2.setBackground(new Color(255, 250, 250));
		springLayout.putConstraint(SpringLayout.NORTH, panel2, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel2, 855, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel2);
		SpringLayout sl_panel2 = new SpringLayout();
		panel2.setLayout(sl_panel2);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 9, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -248, SpringLayout.NORTH, panel1);
		springLayout.putConstraint(SpringLayout.EAST, panel, -20, SpringLayout.WEST, panel2);
		panel.setBackground(new Color(255, 250, 250));

		text_search = new JTextField();
		sl_panel2.putConstraint(SpringLayout.NORTH, text_search, 8, SpringLayout.NORTH, panel2);
		sl_panel2.putConstraint(SpringLayout.SOUTH, text_search, -512, SpringLayout.SOUTH, panel2);
		text_search.setHorizontalAlignment(SwingConstants.LEFT);
		text_search.setFont(new Font("굴림", Font.PLAIN, 14));
		sl_panel2.putConstraint(SpringLayout.WEST, text_search, 10, SpringLayout.WEST, panel2);
		sl_panel2.putConstraint(SpringLayout.EAST, text_search, 501, SpringLayout.WEST, panel2);
		panel2.add(text_search);
		text_search.setColumns(10);

		JButton btn_search = new JButton("찾기");
		sl_panel2.putConstraint(SpringLayout.NORTH, btn_search, 6, SpringLayout.NORTH, text_search);
		sl_panel2.putConstraint(SpringLayout.WEST, btn_search, 6, SpringLayout.EAST, text_search);
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// stuinfo_add ta = new stuinfo_add();
				// try {
				// Object[][] data = ta.classlist();
				// tb_allList.setModel(new DefaultTableModel(
				// data,
				// new String[] {
				// "학번", "이름", "전화번호", "주소", "국어", "영어", "수학", "Java",
				// "Android", "Total", "Average"
				// }
				// ));
				// } catch (Exception e) {
				// e.printStackTrace();
				// }
				//
			}
		});
		panel2.add(btn_search);

		JScrollPane scrollPane = new JScrollPane();
		sl_panel2.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, text_search);
		sl_panel2.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel2);
		sl_panel2.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, btn_search);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel2.add(scrollPane);

		tb_allList = new JTable();
		tb_allList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = tb_allList.getSelectedRow(); // 행
				int col = tb_allList.getSelectedColumn(); // 열

				String input = JOptionPane.showInputDialog(col); // 입력받은 값을 저장
																	// // (col)
																	// 메세지 창에 뜨는
																	// 문구
				System.out.println(input);
				// row =0~30 , col = 4 이면 국어점수
				// row =0~30 , col = 5 이면 영어 점수
				// row =0~30 , col = 6 이면 수학 점수
				// row =0~30 , col = 7 이면 자바 점수
				// row =0~30 , col = 8 이면 안드로이드 점수
				JOptionPane.showMessageDialog(null, input); //

			}
		});
		tb_allList.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "\uD559 \uBC88", "\uC774 \uB984", "\uC804\uD654\uBC88\uD638", "\uC8FC \uC18C",
						"\uAD6D \uC5B4", "\uC601 \uC5B4", "\uC218 \uD559", "\uC790 \uBC14",
						"\uC548\uB4DC\uB85C\uC774\uB4DC", "\uCD1D \uC810", "\uCD1D \uD3C9\uADE0" }));

		tb_allList.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(tb_allList);

		JButton btn_Logout = new JButton("로그아웃");
		sl_panel2.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, btn_Logout);
		sl_panel2.putConstraint(SpringLayout.SOUTH, btn_Logout, -10, SpringLayout.SOUTH, panel2);
		sl_panel2.putConstraint(SpringLayout.EAST, btn_Logout, 0, SpringLayout.EAST, btn_search);
		panel2.add(btn_Logout);

		JButton btn_print = new JButton("\uB0B4\uBCF4\uB0B4\uAE30(\uC5D1\uC140)");
		sl_panel2.putConstraint(SpringLayout.NORTH, btn_print, 0, SpringLayout.NORTH, btn_Logout);
		sl_panel2.putConstraint(SpringLayout.EAST, btn_print, -6, SpringLayout.WEST, btn_Logout);
		panel2.add(btn_print);

		JButton btnNewButton = new JButton("\uD559\uC0DD\uC815\uBCF4\uB4F1\uB85D");
		sl_panel2.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, scrollPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				stuinfoDBUp stuinfodb = new stuinfoDBUp();
				try {
					stuinfodb.stulistup();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		sl_panel2.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, panel2);
		panel2.add(btnNewButton);
		btn_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn_Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btn_mycRank = new JButton("\uC11D\uCC28 \uC870\uD68C");
		btn_mycRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel1.add(btn_mycRank);

		JButton btn_mycAvg = new JButton("\uD3C9\uADE0 \uC870\uD68C");
		btn_mycAvg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel1.add(btn_mycAvg);

		JButton btn_counsling = new JButton("\uC0C1\uB2F4");
		panel1.add(btn_counsling);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lb_TeacherInfo = new JLabel("\uC0AC\uC9C4?");
		sl_panel.putConstraint(SpringLayout.NORTH, lb_TeacherInfo, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lb_TeacherInfo, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lb_TeacherInfo, 0, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lb_TeacherInfo, 125, SpringLayout.WEST, panel);
		panel.add(lb_TeacherInfo);
		lb_TeacherInfo.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 26, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 9, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -32, SpringLayout.NORTH, panel1);

		JLabel label = new JLabel("\uB2F4\uB2F9 \uD559\uAE09");
		sl_panel.putConstraint(SpringLayout.WEST, label, 6, SpringLayout.EAST, lb_TeacherInfo);
		panel.add(label);

		JLabel lblNewLabel_1 = new JLabel("\uD559\uB144");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 72, SpringLayout.NORTH, lb_TeacherInfo);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uBC18");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 72, SpringLayout.NORTH, lb_TeacherInfo);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\uB2F4\uB2F9 \uACFC\uBAA9");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, label);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("subject");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 6, SpringLayout.EAST, lb_TeacherInfo);
		panel.add(lblNewLabel_4);

		JLabel label_1 = new JLabel("\uC774\uB984");
		sl_panel.putConstraint(SpringLayout.NORTH, label_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label_1, 6, SpringLayout.EAST, lb_TeacherInfo);
		panel.add(label_1);

		JLabel lblNewLabel_5 = new JLabel("name");
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel_5);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_5, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_5, 0, SpringLayout.SOUTH, label_1);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		sl_panel.putConstraint(SpringLayout.NORTH, label, 6, SpringLayout.SOUTH, lblNewLabel_6);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 6, SpringLayout.SOUTH, label_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 6, SpringLayout.EAST, lb_TeacherInfo);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("birth");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 6, SpringLayout.SOUTH, lblNewLabel_5);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_7, -10, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_7);

		JLabel lblGrade = new JLabel("num");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, lblGrade);
		sl_panel.putConstraint(SpringLayout.NORTH, lblGrade, 72, SpringLayout.NORTH, lb_TeacherInfo);
		sl_panel.putConstraint(SpringLayout.WEST, lblGrade, 6, SpringLayout.EAST, lb_TeacherInfo);
		panel.add(lblGrade);

		JLabel label_2 = new JLabel("num");
		sl_panel.putConstraint(SpringLayout.NORTH, label_2, 72, SpringLayout.NORTH, lb_TeacherInfo);
		sl_panel.putConstraint(SpringLayout.EAST, label_2, -6, SpringLayout.WEST, lblNewLabel_2);
		panel.add(label_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 260, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0, 0, 0));

		JLabel lblSubject = new JLabel("\uACFC\uBAA9");
		lblSubject.setFont(new Font("굴림", Font.BOLD, 14));
		lblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblSubject);

		JButton btn_subScore = new JButton("\uC131\uC801 \uD655\uC778 / \uC218\uC815");
		btn_subScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel_1.add(btn_subScore);

		JButton btn_subModi = new JButton("\uC131\uC801 \uC218\uC815");
		panel_1.add(btn_subModi);

		JButton btn_subAvg = new JButton("\uD3C9\uADE0");
		panel_1.add(btn_subAvg);

		JButton btn_subRank = new JButton("\uC11D\uCC28 \uC870\uD68C");
		panel_1.add(btn_subRank);
	}
}
