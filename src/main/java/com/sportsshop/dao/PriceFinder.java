package com.sportsshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceFinder {
	public static int priceFInder(int id) throws ClassNotFoundException, SQLException
	{
		Connection connection ;
        PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query ="select price from products where id=?";
;
		statement = connection.prepareStatement(query);
		statement.setInt(1,id); 
		
		ResultSet result=statement.executeQuery();
		int price=0;
		while(result.next())
		{
			price=result.getInt("price");
		}
		return price;
	}

}
