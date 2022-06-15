package com.sportsshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteProductDao {
	public static void productDeletionById(int id) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from products  where id = ?";
		;
		statement = connection.prepareStatement(query);
		statement.setInt(1, id);

		int rows = statement.executeUpdate();
		System.out.println("no of products deleted by using id :" + rows);

	}

	public static void productDeletionByName(String name) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from products  where name = ?";
		;
		statement = connection.prepareStatement(query);
		statement.setString(1, name);

		int rows = statement.executeUpdate();
		System.out.println("no of products deleted by using name" + rows);

	}

	public static void productDeletionByBrand(String brand) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from products  where brand = ?";
		;
		statement = connection.prepareStatement(query);
		statement.setString(1, brand);

		int rows = statement.executeUpdate();
		System.out.println("no of products deleted by using brand :" + rows);

	}

	public static void productDeletionBycategory(String category) throws SQLException, ClassNotFoundException {
		Connection connection;
		PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query = "delete from products  where category = ?";
		;
		statement = connection.prepareStatement(query);
		statement.setString(1, category);

		int rows = statement.executeUpdate();
		System.out.println("no of products deleted by using category:" + rows);

	}

}
