
package com.sportshop.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.sportsshop.dao.DeleteProductDao;

public class ProductDeletionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Delete by id");
		System.out.println("2)Delete by name");
		System.out.println("3)Delete by brand");
		System.out.println("4)Delete by categeory");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter product id to delete");
			int id =sc.nextInt();
			DeleteProductDao.productDeletionById(id);
		}
		else if(option==2)
		{
			System.out.println("Enter product name to delete");
			String name=sc.next();
			DeleteProductDao.productDeletionByName(name);
		}
		else if(option==3)
		{
			System.out.println("Enter product brand to delete");
			String brand=sc.next();
			DeleteProductDao.productDeletionByBrand(brand);
		}
		else if(option==4)
		{
			System.out.println("Enter product category to delete");
			String category=sc.next();
			DeleteProductDao.productDeletionBycategory(category);
		}
	sc.close();
	}

}
