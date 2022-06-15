package com.sportsshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sportsshop.model.Products;

public class BuyProductsDao {
	public static List<Products> allProducts() throws ClassNotFoundException, SQLException
	{
		List<Products> products=new ArrayList<Products>();
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select * from products";
		statement=connection.prepareStatement(query);
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String brand=null;
		String category=null;
		int price=0;
		Products product=null;
		while(result.next())
		{
			product=new Products();
			id=result.getInt("id");
			name=result.getString("NAME");
			brand=result.getString("brand");
			category=result.getString("category");
			price=result.getInt("price");
			product.setName(name);
			product.setBrand(brand);
			product.setCategory(category);
			product.setPrice(price);
			product.setId(id);
			products.add(product);
			
			
		}
		return products;
		
		
	}

}
