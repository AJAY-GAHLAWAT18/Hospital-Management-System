package com.ajay.billing.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ajay.billing.main.Dashboard;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JRadioButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
					Login frame = new Login();
					frame.setVisible(true);
	}
	private void register() {
		this.setVisible(false);
		this.dispose();
		Register reg = new Register();
		reg.setVisible(true);
		}
	
	
	private void loginCheck(){
		String userid = textField.getText();
		
		String password = new String(passwordField.getPassword()); //new string is used as password is stored
		//as char[] inside so we need to convert it into string to 
		userDAO userDAO = new userDAO();
		String message = "Invalid Userid or Password";
		boolean isFound;
		try {
			isFound = userDAO.loginCheck(userid, password);
			if(isFound) {
				message="Welcome "+userid;
				this.setVisible(false);
				this.dispose();
				Dashboard dashBoard = new Dashboard(userid);
				dashBoard.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dashBoard.setVisible(true);
			}
			JOptionPane.showMessageDialog(this, message);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		}
		

	
	
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setEchoChar((char) 0);
			}
		});
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(641, 247, 120, 27);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblLogin = new JLabel("Login Form");
		lblLogin.setForeground(Color.RED);
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(99, 29, 148, 33);
		contentPane.add(lblLogin);
		
		JLabel lblUserid = new JLabel("UserId ");
		lblUserid.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblUserid.setBounds(465, 180, 71, 21);
		contentPane.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(465, 203, 296, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblPassword.setBounds(465, 241, 82, 33);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginCheck();
			}
		});
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/com/ajay/billing/user/icon.png")));
		btnLogin.setBackground(UIManager.getColor("Button.highlight"));
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBounds(530, 429, 159, 56);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(465, 274, 296, 27);
		contentPane.add(passwordField);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnReset.setBackground(UIManager.getColor("Button.highlight"));
		btnReset.setBounds(465, 333, 101, 32);
		contentPane.add(btnReset);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnNewButton.setBounds(641, 333, 120, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/com/ajay/billing/main/iphone_6-7-8___1_2x.png")));
		lblNewLabel.setBounds(10, 11, 771, 474);
		contentPane.add(lblNewLabel);
	}
}
