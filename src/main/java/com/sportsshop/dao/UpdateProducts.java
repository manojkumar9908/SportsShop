
package com.sportsshop.dao;
    import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	//import com.sportsshop.model.Products;

	public class UpdateProducts { 
		public static void productUpdateByName(int price, String name) throws SQLException, ClassNotFoundException
		{
			Connection connection ;
	        PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			String query =  "update  products set price = ? where NAME  = ? " ;
 ;
 ;
;
			statement = connection.prepareStatement(query);
			statement.setInt(1,price); 
			statement.setString(2,name);
			
			int rows=statement.executeUpdate();
			System.out.println(" No of rows product updated : "+rows);
			
		}
		public static void productUpdateByBrand(int price,String brand) throws SQLException, ClassNotFoundException
		{
			Connection connection ;
	        PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			String query =   "update products set price = ?  where brand = ?" ;
;
			statement = connection.prepareStatement(query);
			statement.setInt(1,price);
			statement.setString(2,brand); 
			
			int rows=statement.executeUpdate();
			System.out.println(" No of rows brand updated : "+rows);

		}
		public static void productUpdateBycategory(int price,String category) throws SQLException, ClassNotFoundException
		{
			Connection connection ;
	        PreparedStatement statement;
			connection = ConnectionUtil.databaseConnection();
			String query =   "update  products set price = ? where category = ?" ;
;
			statement = connection.prepareStatement(query);
			statement.setInt(1,price);
			statement.setString(2,category); 
			
	}
	}

