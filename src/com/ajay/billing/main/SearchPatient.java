package com.ajay.billing.main;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchPatient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public void back() {
		this.setVisible(false);
		this.dispose();
	}
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPatient frame = new SearchPatient();
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
	public SearchPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchOrUpdate = new JLabel("Search Or Update Patient ");
		lblSearchOrUpdate.setBackground(Color.WHITE);
		lblSearchOrUpdate.setForeground(Color.RED);
		lblSearchOrUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchOrUpdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblSearchOrUpdate.setBounds(39, 27, 539, 59);
		contentPane.add(lblSearchOrUpdate);
		
		JLabel lblName = new JLabel("Patient Id");
		lblName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblName.setBounds(48, 110, 96, 48);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(210, 121, 171, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Patient Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(48, 169, 139, 30);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(210, 162, 171, 30);
		contentPane.add(textField_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblGender.setBounds(48, 210, 96, 48);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(210, 225, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnNewRadioButton_1.setBounds(272, 225, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);bg.add(rdbtnNewRadioButton_1);
JLabel lblFathersName = new JLabel("Father's Name");
lblFathersName.setFont(new Font("Tahoma", Font.ITALIC, 16));
lblFathersName.setBounds(48, 269, 139, 48);
contentPane.add(lblFathersName);
textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(210, 269, 171, 30);
contentPane.add(textField_2);
JLabel lblAge = new JLabel("Age");
lblAge.setFont(new Font("Tahoma", Font.ITALIC, 16));
lblAge.setBounds(48, 322, 96, 48);
contentPane.add(lblAge);
JSpinner spinner = new JSpinner();
spinner.setModel(new SpinnerNumberModel(1, 0, 60, 1));
spinner.setBounds(210, 338, 41, 20);
contentPane.add(spinner);
JLabel lblContactNo = new JLabel("Contact No");
lblContactNo.setFont(new Font("Tahoma", Font.ITALIC, 16));
lblContactNo.setBounds(48, 368, 96, 48);
contentPane.add(lblContactNo);
textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(210, 379, 171, 30);
contentPane.add(textField_3);
JButton btnNewButton = new JButton("Back");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	back();
	}
});
btnNewButton.setBounds(471, 437, 89, 23);
contentPane.add(btnNewButton);
JButton btnNewButton_1 = new JButton("Reset");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		
		
	}
});
btnNewButton_1.setBounds(48, 437, 89, 23);
contentPane.add(btnNewButton_1);
JButton btnNewButton_2 = new JButton("Update");
btnNewButton_2.setBounds(195, 437, 89, 23);
contentPane.add(btnNewButton_2);
JButton btnNewButton_3 = new JButton("Search");
btnNewButton_3.setBounds(336, 437, 89, 23);
contentPane.add(btnNewButton_3);
	}
}
