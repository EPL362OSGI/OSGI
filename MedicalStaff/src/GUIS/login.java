package GUIS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxt;
	private JTextField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Medigal Staff Log In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		JLabel lblLogInAs = new JLabel("Log in as:");
		GridBagConstraints gbc_lblLogInAs = new GridBagConstraints();
		gbc_lblLogInAs.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogInAs.anchor = GridBagConstraints.EAST;
		gbc_lblLogInAs.gridx = 2;
		gbc_lblLogInAs.gridy = 2;
		panel.add(lblLogInAs, gbc_lblLogInAs);
		
		JComboBox loginAsCmb = new JComboBox();
		loginAsCmb.setModel(new DefaultComboBoxModel(new String[] {"Clinical Staff", "Receptionist", "Health Service Management"}));
		GridBagConstraints gbc_loginAsCmb = new GridBagConstraints();
		gbc_loginAsCmb.insets = new Insets(0, 0, 5, 5);
		gbc_loginAsCmb.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginAsCmb.gridx = 3;
		gbc_loginAsCmb.gridy = 2;
		panel.add(loginAsCmb, gbc_loginAsCmb);
		
		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 2;
		gbc_lblUsername.gridy = 4;
		panel.add(lblUsername, gbc_lblUsername);
		
		usernameTxt = new JTextField();
		GridBagConstraints gbc_usernameTxt = new GridBagConstraints();
		gbc_usernameTxt.insets = new Insets(0, 0, 5, 5);
		gbc_usernameTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_usernameTxt.gridx = 3;
		gbc_usernameTxt.gridy = 4;
		panel.add(usernameTxt, gbc_usernameTxt);
		usernameTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 2;
		gbc_lblPassword.gridy = 5;
		panel.add(lblPassword, gbc_lblPassword);
		
		passwordTxt = new JTextField();
		GridBagConstraints gbc_passwordTxt = new GridBagConstraints();
		gbc_passwordTxt.insets = new Insets(0, 0, 5, 5);
		gbc_passwordTxt.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordTxt.gridx = 3;
		gbc_passwordTxt.gridy = 5;
		panel.add(passwordTxt, gbc_passwordTxt);
		passwordTxt.setColumns(10);
		
		JButton loginBtn = new JButton("Log In");
		GridBagConstraints gbc_loginBtn = new GridBagConstraints();
		gbc_loginBtn.insets = new Insets(0, 0, 0, 5);
		gbc_loginBtn.anchor = GridBagConstraints.BASELINE;
		gbc_loginBtn.gridx = 3;
		gbc_loginBtn.gridy = 6;
		panel.add(loginBtn, gbc_loginBtn);
	}

}
