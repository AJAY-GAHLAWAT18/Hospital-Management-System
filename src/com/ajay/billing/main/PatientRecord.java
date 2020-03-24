package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientRecord extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public void back() {
		this.setVisible(false);
		this.dispose();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientRecord frame = new PatientRecord();
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
	public PatientRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		scrollPane.setBounds(10, 113, 605, 152);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		table.setBackground(new Color(238, 232, 170));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Ajay", "M", "20", "12/5", "7400201650"},
				{"2", "Monika", "F", "45", "11/6", "8930383991"},
				{"3", "Rohan", "M", "32", "12/6", "9468327623"},
				{"4", "Mohit", "M", "25", "13/6", "6217624761"},
				{"5", "Ashish", "M", "16", "13/6", null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"S No.", "Name", "Gender", "Age", "Date", "Contact No."
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(258, 279, 92, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPatientRecord = new JLabel("Patient Records");
		lblPatientRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientRecord.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblPatientRecord.setForeground(new Color(255, 0, 0));
		lblPatientRecord.setBounds(159, 11, 284, 50);
		contentPane.add(lblPatientRecord);
		
		JLabel lblPatientId = new JLabel("Patient Id ");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPatientId.setBounds(25, 76, 65, 26);
		contentPane.add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPatientName.setBounds(232, 76, 92, 26);
		contentPane.add(lblPatientName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAge.setBounds(456, 76, 46, 26);
		contentPane.add(lblAge);
		
		String[] numbers = {"1","2","3","4","5","6","8","9","10"};
		JComboBox comboBox = new JComboBox(numbers);
		comboBox.setToolTipText("");
		comboBox.setBounds(96, 80, 38, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ajay", "Ram ", "Rohan ", "Mohit", "Riya"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(325, 80, 53, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(new Object[]{});
		comboBox_2.setMaximumRowCount(12);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(512, 80, 53, 22);
		contentPane.add(comboBox_2);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
