package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bill extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void back()
	{
		this.setVisible(false);
		this.dispose();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill();
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
	public Bill() {
		setResizable(false);
		setTitle("Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Bill.class.getResource("/com/ajay/billing/main/istockphoto-1036962036-612x612.jpg")));
		lblNewLabel.setBounds(0, 83, 568, 249);
		contentPane.add(lblNewLabel);
		
		JButton btnPrintBill = new JButton("Print Bill");
		btnPrintBill.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPrintBill.setBackground(SystemColor.controlHighlight);
		btnPrintBill.setBounds(32, 23, 130, 43);
		contentPane.add(btnPrintBill);
		
		JButton btnNewButton = new JButton("Previous Bill");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(217, 23, 141, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnNewButton_1.setBackground(SystemColor.controlHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(419, 29, 108, 36);
		contentPane.add(btnNewButton_1);
	}

}
