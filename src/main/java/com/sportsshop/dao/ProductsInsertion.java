package com.sportsshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sportsshop.model.Products;

public class ProductsInsertion {
	public static void productInsertion(Products product) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "insert into products( NAME,brand,category,price) values (?,?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setString(1,product.getName()); 
		statement.setString(2, product.getBrand()); 
		statement.setString(3, product.getCategory()); 
		statement.setInt(4, product.getPrice()); 
		
		int rows=statement.executeUpdate();
		System.out.println("the product is updated :"+ rows);

	}


}
