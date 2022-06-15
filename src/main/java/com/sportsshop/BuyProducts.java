package com.sportsshop;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sportsshop.dao.BuyProductsDao;
import com.sportsshop.dao.PriceFinder;
import com.sportsshop.dao.TransactionInsertion;
import com.sportsshop.model.Products;

public class BuyProducts {
	     static List<Integer> list=null;
	     
	     static Scanner sc=new Scanner(System.in);
	public static void allProduct() throws ClassNotFoundException, SQLException
	{
		List<Products> products=BuyProductsDao.allProducts();
		for(Products product:products)
		{
			System.out.println(product.getId()+"  "+product.getName()+"  "+product.getBrand()+"  "+product.getCategory()+"  "+product.getPrice());
		}
		list=new ArrayList<Integer>();
		buyProduct();
		
	}
	public static void buyProduct() throws ClassNotFoundException, SQLException
	{
		 int total=0;
		System.out.println("select the product you wanted");
		int id=sc.nextInt();
		list.add(id);
		for(Integer productId:list)
		{
			int price=PriceFinder.priceFInder(productId);
			total=total+price;
		}
		System.out.println("Your total price is : "+total);
		System.out.println("1) continue payment");
		System.out.println("2) continue purchasing");
		int option=sc.nextInt();
		if(option==1)
		{
			int verified=payment(total);
			if(verified==1)
			{
				for(Integer prodId:list)
				{	
				   TransactionInsertion.transaction(prodId);
				}
				System.out.println("Order placed successfully");
			}
		}
		else if(option==2)
		{
			buyProduct();
		}
	}
	public static int payment(int total)
	{
		System.out.println("Enter your upi id");
		String upi =sc.next();
		System.out.println("your total price is : "+total);
		System.out.println("Enter amount to pay");
		int amount=sc.nextInt();
		if(amount>total || amount<total)
		{
			System.out.println("Please pay : "+total);
			payment(total);
		}
		else if(amount==total)
		{
			return 1;
		}
		return 1;
	}

}
