package com.sportsshop.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;



public class Login {
	public static void login() throws Exception {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter login Email");
	String email=scan.next();
	System.out.println("Enter the password");
	String password=scan.next();
	// Driver Manager
	//Class.forName("com.mysql.jdbc.Driver");
//get connection	
	Connection connection=DriverManager
			.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	String query="select email,password from Sports_shop where email='"+email+"'";
	java.sql.Statement statement= connection.createStatement();
	ResultSet result = ((java.sql.Statement) statement).executeQuery(query);
	String useremail= null;
	String userpassword=null;	
	while(result.next()) {
		useremail=result.getString("email");
		userpassword=result.getString("password");
		}
	if(useremail==null) {
		System.out.println("No records found - please register");
	}
	else if(userpassword.equals(password)) {
		System.out.println("WELCOME TO sports Shop");
	}
	else {
		System.out.println("Invalid Credentials");
	}
	scan.close();
}

}
