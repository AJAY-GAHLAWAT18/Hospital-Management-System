package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ajay.billing.user.Login;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.JTextField;
import java.awt.Font;

public class IntroFrame extends JWindow {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	
	
	private Timer timer;
	JProgressBar progressBar = new JProgressBar();
	int counter=1;
	private JTextField txtL;
	private void doProgress() {
		// TODO Auto-generated method stub
		
		timer = new Timer(100,(e)->{
			if(counter>=100) {
				timer.stop();
				this.setVisible(false);
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
			}
			
			progressBar.setValue(counter);
			counter++;
		}) ;
		timer.start();
		
	}

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		IntroFrame frame = new IntroFrame();
		frame.setVisible(true);
		frame.doProgress();
		
		
	}

	
	/**
	 * Create the frame.
	 */
	public IntroFrame() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(IntroFrame.class.getResource("/com/ajay/billing/main/product-500x500.jpeg")));
		lblNewLabel.setBounds(0, 0, 434, 196);
		contentPane.add(lblNewLabel);
		
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 236, 414, 14);
		contentPane.add(progressBar);
		
		txtL = new JTextField();
		txtL.setBackground(new Color(230, 230, 250));
		txtL.setForeground(Color.BLACK);
		txtL.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtL.setText("Loading.....");
		txtL.setBounds(10, 205, 414, 25);
		contentPane.add(txtL);
		txtL.setColumns(10);
	}
}
