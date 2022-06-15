package com.sportsitems;
import java.util.Scanner;

import com.sportsshop.SignUp;
import com.sportsshop.dao.Login;

public class SportsTest {

	
	    
		public static void main(String[] args)throws Exception {
			// TODO Auto-generated method stub
		System.out.println("1)Register");
		System.out.println("2)Login");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1)
		{
		SignUp.SignUpin();
		}
		else if(option==2) {
		Login.login();	
		}
		sc.close();
		

		}

	







     

	
		
		
	}


 