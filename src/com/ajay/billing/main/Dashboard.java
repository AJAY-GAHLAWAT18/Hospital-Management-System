package com.ajay.billing.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.ajay.billing.user.utils.ExcelReader;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class Dashboard extends JFrame {

	private JPanel contentPane;

	private void doupload()  {
		JFileChooser browse=new JFileChooser("C:\\Users\\ajayg\\JAVA Brain Mentor"); //to choose file
		browse.showOpenDialog(this);
		File file=browse.getSelectedFile();   //it reads the file in binary form
		try {
			ExcelReader.readXLS(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public Dashboard(String userid) {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 742);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdmin = new JMenu("Admin");
		mnAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnAdmin);
		
		JMenuItem mntmUpload = new JMenuItem("upload");
		mntmUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					doupload();

			}
		});
		mnAdmin.add(mntmUpload);
		
		mnAdmin.addSeparator();
		JMenuItem mntmBill = new JMenuItem("Bill");
		mntmBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Bill billing =new Bill();
			billing.setVisible(true);
			
			}
		});
		mnAdmin.add(mntmBill);
		mnAdmin.addSeparator();
		
		JMenuItem mntmExit = new JMenuItem("exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnAdmin.add(mntmExit);
		
		JMenu mnDoctorsInformation = new JMenu("Doctor's Information");
		menuBar.add(mnDoctorsInformation);
		
		JMenuItem mntmDoctorAvailable = new JMenuItem("Doctor Available");
		mnDoctorsInformation.add(mntmDoctorAvailable);
		mntmDoctorAvailable.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DoctorsAvailabe docinfo=new DoctorsAvailabe();
				docinfo.setVisible(true);
			}
		});
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnDoctorsInformation.add(menuBar_1);
		
		JMenu mnPatientsInformation = new JMenu("Patient's Information");
		menuBar.add(mnPatientsInformation);
		
		JMenuItem mntmPatients = new JMenuItem("Patients");
		mnPatientsInformation.add(mntmPatients);
		mntmPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			PatientsInformation patinfo =new PatientsInformation();
			patinfo.setVisible(true);
			
			
			}
		});
		JMenu mnEquipments = new JMenu("Equipments");
		menuBar.add(mnEquipments);
		
		JMenu mnBloodBank = new JMenu("Blood Bank");
		menuBar.add(mnBloodBank);
		
		JMenu mnAboutUs = new JMenu("About us");
		menuBar.add(mnAboutUs);
		
		JMenuItem mntmAboutHospital = new JMenuItem("About Hospital ");
		mnAboutUs.add(mntmAboutHospital);
		
		JMenuItem mntmSoftwareDevelopers = new JMenuItem("Software Developers");
		mnAboutUs.add(mntmSoftwareDevelopers);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel welcomelbl = new JLabel("Welcome "+userid);
	welcomelbl.setIcon(new ImageIcon(Dashboard.class.getResource("/com/ajay/billing/main/hospital2.jpg")));
	welcomelbl.setVerticalAlignment(SwingConstants.TOP);
	welcomelbl.setForeground(Color.RED);
	welcomelbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	welcomelbl.setBounds(0, 0, 665, 681);
	contentPane.add(welcomelbl);
	
	JLabel lblAHospital = new JLabel(">  A hospital is a health care institution providing patient treatment \r\nwith specialized medical and nursing staff and medical equipment.");
	lblAHospital.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblAHospital.setBounds(10, 477, 900, 46);
	contentPane.add(lblAHospital);
	
	JLabel lblAfterCoughing = new JLabel(">  After coughing or blowing your nose into a paper tissue, throw the tissue away and apply hand sanitiser.");
	lblAfterCoughing.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblAfterCoughing.setBounds(10, 534, 750, 17);
	contentPane.add(lblAfterCoughing);
	
	JLabel lblKeepYour = new JLabel(">  \r\nKeep your bed and your surroundings neat and tidy.");
	lblKeepYour.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblKeepYour.setBounds(10, 573, 750, 17);
	contentPane.add(lblKeepYour);
	
	JLabel lblTakeOwnership = new JLabel(">  Take Ownership & spread awareness about benefit of cleanliness.");
	lblTakeOwnership.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblTakeOwnership.setBounds(10, 608, 750, 17);
	contentPane.add(lblTakeOwnership);
	
	JLabel lblDoNot = new JLabel(">  Do not take medicines without a doctor's prescription.");
	lblDoNot.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblDoNot.setBounds(10, 640, 750, 17);
	contentPane.add(lblDoNot);
	}
}
