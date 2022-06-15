
package com.sportshop.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.sportsshop.dao.ProductsInsertion;
import com.sportsshop.model.Products;

public class ProductsInsertionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Name");
		String name=sc.next();
		System.out.println("Enter product Brand");
		String brand=sc.next();
		System.out.println("Enter product Category");
		String category=sc.next();
		System.out.println("Enter product price");
		int price=sc.nextInt();
		Products product=new Products();
		product.setName(name);
		product.setBrand(brand);
		product.setCategory(category);
		product.setPrice(price);
		ProductsInsertion.productInsertion(product);
       sc.close();
	}


}