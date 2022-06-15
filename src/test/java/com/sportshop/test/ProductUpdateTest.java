
package com.sportshop.test;
       import java.sql.SQLException;
		import java.util.Scanner;
		
import com.sportsshop.dao.UpdateProducts;
		
		
		public class ProductUpdateTest {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("1)Update by product");
				System.out.println("2)Update by  product brand");
				System.out.println("3)Update by product category");
				int option=sc.nextInt();
				if(option==1)
				{
					System.out.println("Enter product price");
					int price =sc.nextInt();
					System.out.println("Enter product name");
				String name =sc.next();
					UpdateProducts.productUpdateByName(price,name);
				}
				else if(option==2)
				{
					System.out.println("Enter  brand price ");
					int price =sc.nextInt();
					System.out.println("Enter  brand name");
				String brand =sc.next();
					UpdateProducts.productUpdateByName(price,brand);
				
				}
				else if(option==3)
				{
					System.out.println("Enter  category price ");
					int price =sc.nextInt();
					System.out.println("Enter  category name ");
				String category =sc.next();
					UpdateProducts.productUpdateByName(price,category);
					
				}
			sc.close();
			}


	}


