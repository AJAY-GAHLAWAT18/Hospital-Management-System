package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ajay.billing.user.Login;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class PatientsInformation extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		Login frame = new Login();
		frame.setVisible(true);
}
public void back() {
this.setVisible(false);
this.dispose();
//Dashboard dashb = new Dashboard(null);
//`dashb.setVisible(true);
}
public void searchpat() {
this.setVisible(false);
this.dispose();
SearchPatient searchpat=new SearchPatient();
searchpat.setVisible(true);
}

	/**
	 * Create the frame.
	 */
	public PatientsInformation() {
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Patients Information");
		lblNewLabel.setBounds(10, 11, 680, 37);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(lblNewLabel);
		
		JButton btnSearchPatients = new JButton("Search Patients");
		btnSearchPatients.setBounds(153, 389, 372, 23);
		contentPane.add(btnSearchPatients);
		btnSearchPatients.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			searchpat();
				
			}
		});
		
		
		JButton btnInsertPatients = new JButton("Insert Patients");
		btnInsertPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsertPatients.setBounds(153, 434, 372, 23);
		contentPane.add(btnInsertPatients);
		
		JButton btnDeletePatients = new JButton("Delete Patients");
		btnDeletePatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletePatients.setBounds(153, 481, 372, 23);
		contentPane.add(btnDeletePatients);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnGoBack.setBounds(153, 527, 372, 23);
		contentPane.add(btnGoBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PatientsInformation.class.getResource("/com/ajay/billing/main/download (2).png")));
		label.setBounds(20, 59, 614, 304);
		contentPane.add(label);
	}
}
