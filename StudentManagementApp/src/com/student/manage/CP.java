package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC() {
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			String user="root";
			String password="Rudra@890";
			String url="jdbc:mysql://localhost:3306/student_db";
			con=DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}

}
