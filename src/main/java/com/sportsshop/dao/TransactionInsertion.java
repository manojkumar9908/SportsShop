package com.sportsshop.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class TransactionInsertion {
	public static void transaction(int product_id) throws ClassNotFoundException, SQLException
	{
		Connection connection ;
        PreparedStatement statement;
        Date date=Date.valueOf(LocalDate.now());
		connection = ConnectionUtil.databaseConnection();
		String query = "insert into sports_transactions( user_id,product_id,purchased_on) values (?,?,?)";
		statement = connection.prepareStatement(query);
		statement.setInt(1,2); 
		statement.setInt(2,product_id); 
		statement.setDate(3,date);
		
		int rows=statement.executeUpdate();
		System.out.println("the product is updated :"+ rows);
	}

}
