package com.ajay.billing.user.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface CommonDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
	Connection con=null;
	String connectionString ="jdbc:mysql://localhost:3306/billingdb";
	String dbUserid="root";       
	String dbPassword="1234";    
Class.forName("com.mysql.cj.jdbc.Driver");          
System.out.println("driver loaded....");
con=DriverManager.getConnection(connectionString,dbUserid,dbPassword);
	return con;
	}
	
	
	/*for making connection with sql data present in that file for static checking
	 * 
	 * public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 
		String uid="ajay";
		String pwd="123456";
		Connection con=null;
		String connectionString ="jdbc:mysql://localhost:3306/billingdb";
		String dbUserid="root";       //sql user name by default its root
		String dbPassword="1234";    //password of sql
	Class.forName("com.mysql.cj.jdbc.Driver");           //driver loaded
	System.out.println("driver loaded....");
	con=DriverManager.getConnection(connectionString,dbUserid,dbPassword); //making connection
	Statement stmt=con.createStatement();  //to create a statement
	ResultSet rs=stmt.executeQuery("select userid from user_mst where userid='"+uid+"' and password= '"+pwd+"'");
	// to write a sql enquiry
	if(rs.next()) {    //to check is there anything present in rs we use .next()
		System.out.println("Welcome "+uid);
	}
	else {
		System.out.println("Invalid Userid or Password");
	}
	rs.close(); //at last remember to close database connection
	stmt.close();
	//con.close();
	if(con!=null) {
		System.out.println("Connection Created....");
		//con.close();
	}
	}*/
}
