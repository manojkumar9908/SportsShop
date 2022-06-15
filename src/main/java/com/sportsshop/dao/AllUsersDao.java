package com.sportsshop.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
		public class AllUsersDao {
			public static void allUsers() throws SQLException, ClassNotFoundException
			{
				
				Connection connection ;
		        PreparedStatement statement;
		        ResultSet rs;
				connection = ConnectionUtil.databaseConnection();
				String query = "select name from Sports_shop " ;
	;
				statement = connection.prepareStatement(query);
				rs=statement.executeQuery();
				String name=null;
				while(rs.next())
				{
					name=rs.getString("NAME");
					System.out.println(name);
				}
			}
		}



