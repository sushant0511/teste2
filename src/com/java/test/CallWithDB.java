package com.java.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class CallWithDB {

	public static void main(String[] args) {
		try
		{
			 
		Class.forName("com.mysql.cj.jdbc.Driver");  // 
		
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/abc", "root","root");
		Statement statement=connection.createStatement(); // execute your query
		ResultSet set=statement.executeQuery("select * from user");
		while(set.next())
		{
			System.out.println(set.getInt(1)+"  "+set.getString(2)+"  "+set.getFloat(3));
		}
		
		
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
