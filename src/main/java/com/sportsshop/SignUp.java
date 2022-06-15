package com.sportsshop;

import java.util.Scanner;

public class SignUp {
	public static void SignUpin() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the user name");
		String name = sc.nextLine();
		
		System.out.println("enter the email");
		String email = sc.nextLine();
		
		System.out.println("Enter the password");
		String password = sc.nextLine();
		
		System.out.println("Enter the number");
		String number = sc.nextLine();
		
	
sc.close();

try { 
	
	int a=Validation.Checkname(name);
 
	
}
catch(Exception e){
	System.err.println("Error"+e.getMessage());
	
	
}
try { 
	

 int b =	Validation.Checkemail(email);
 	
	
}
catch(Exception e){
	System.err.println("Error"+e.getMessage());
	
	
}
try { 
	

int c = 	Validation.Checkpassword(password);
	
	
}
catch(Exception e){
	System.err.println("Error"+e.getMessage());
	
	
}
try { 
	
	
int d =	Validation	.Checknumber(number);
	
}
catch(Exception e){
	System.err.println("Error"+e.getMessage());
	
	
}
Registration t=new Registration(name,email,password,number);
SqlQuery.Datain(t);
	

}


	
}