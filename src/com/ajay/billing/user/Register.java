package com.ajay.billing.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.Canvas;
import javax.swing.JRadioButton;

public class Register extends JFrame {

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
	public void back() {
		this.setVisible(false);
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}
	
	private void register() throws ClassNotFoundException, SQLException {

		
		String userid = textField.getText();
		String password = new String(passwordField.getPassword()); 
		userDAO userDao = new userDAO();
		
		if(userDao.isUserExist(userid)){
			JOptionPane.showMessageDialog(this, "user id already exist");
		}
		boolean isAdded = userDao.register(userid, password);
		JOptionPane.showMessageDialog(this, isAdded?"Record Added":"Not Added");
		}
		

	

	
	
	
	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 535);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("Show Password");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setEchoChar((char) 0);
			}
		});
		radioButton.setBackground(Color.LIGHT_GRAY);
		radioButton.setBounds(641, 248, 120, 27);
		contentPane.add(radioButton);
		
		Canvas canvas = new Canvas();
		canvas.setForeground(new Color(255, 255, 255));
		canvas.setEnabled(false);
		canvas.setBackground(new Color(255, 255, 255));
		canvas.setBounds(465, 21, 278, 133);
		contentPane.add(canvas);
		
		JLabel lblUserid = new JLabel("UserId");
		lblUserid.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblUserid.setBounds(465, 178, 71, 21);
		contentPane.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(465, 203, 296, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblPassword.setBounds(465, 241, 82, 33);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Register");
		btnLogin.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					register();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
		});
		btnLogin.setIcon(null);
		btnLogin.setBackground(UIManager.getColor("Button.highlight"));
		btnLogin.setForeground(SystemColor.desktop);
		btnLogin.setBounds(529, 432, 161, 53);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(465, 274, 296, 27);
		contentPane.add(passwordField);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				textField.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnReset.setBackground(UIManager.getColor("Button.highlight"));
		btnReset.setBounds(653, 334, 108, 32);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnBack.setBounds(465, 334, 108, 32);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Register.class.getResource("/com/ajay/billing/main/iphone_6-7-8___1_2x.png")));
		lblNewLabel.setBounds(10, 11, 771, 474);
		contentPane.add(lblNewLabel);
	}
}
