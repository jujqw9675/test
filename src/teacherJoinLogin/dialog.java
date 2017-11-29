package teacherJoinLogin;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class dialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public dialog(String strArr) {
		setVisible(true);

		setBounds(100, 100, 300, 150);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, contentPanel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, contentPanel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, contentPanel, 79, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, contentPanel, 284, SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			JLabel lblNewLabel = new JLabel(strArr);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, buttonPane, 79, SpringLayout.NORTH, getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, buttonPane, 0, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, buttonPane, 0, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, buttonPane, 284, SpringLayout.WEST, getContentPane());
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						login login = new login();
						login.frame.setVisible(true);
						setVisible(false);
					}
				});
				SpringLayout sl_buttonPane = new SpringLayout();
				sl_buttonPane.putConstraint(SpringLayout.NORTH, okButton, 0, SpringLayout.NORTH, buttonPane);
				sl_buttonPane.putConstraint(SpringLayout.EAST, okButton, -116, SpringLayout.EAST, buttonPane);
				buttonPane.setLayout(sl_buttonPane);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}

		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

}