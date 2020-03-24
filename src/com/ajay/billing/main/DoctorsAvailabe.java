package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorsAvailabe extends JFrame {

	private JPanel contentPane;
	public void PatientRecord() {
		this.setVisible(false);
		this.dispose();
		PatientRecord patr=new PatientRecord();
		patr.setVisible(true);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsAvailabe frame = new DoctorsAvailabe();
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
	public DoctorsAvailabe() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoctorsAvailable = new JLabel("DOCTORS  AVAILABLE");
		lblDoctorsAvailable.setForeground(new Color(255, 0, 0));
		lblDoctorsAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctorsAvailable.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblDoctorsAvailable.setBounds(60, 76, 373, 52);
		contentPane.add(lblDoctorsAvailable);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(DoctorsAvailabe.class.getResource("/com/ajay/billing/main/download (1).jpg")));
		lblNewLabel.setBounds(10, 127, 473, 185);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SEARCH RECORD");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(20, 323, 221, 31);
		contentPane.add(btnNewButton);
		
		JButton btnAddDoctor = new JButton("ADD DOCTOR");
		btnAddDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddDoctor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAddDoctor.setBounds(251, 323, 221, 31);
		contentPane.add(btnAddDoctor);
		
		JButton btnDeleteDoctor = new JButton("DELETE DOCTOR");
		btnDeleteDoctor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDeleteDoctor.setBounds(20, 389, 221, 31);
		contentPane.add(btnDeleteDoctor);
		
		JButton btnSeeAllRecords = new JButton("SEE ALL RECORDS");
		btnSeeAllRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientRecord();			}
		});
		btnSeeAllRecords.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSeeAllRecords.setBounds(251, 389, 221, 31);
		contentPane.add(btnSeeAllRecords);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBounds(20, 25, 76, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(405, 25, 67, 31);
		contentPane.add(btnExit);
	}
}
