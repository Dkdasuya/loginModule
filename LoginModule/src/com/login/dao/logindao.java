package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class logindao {
	
	String sql="select * from credentials where uname=? and pass=?;";
	String username="root";
	String password="Dheeraj789%";
	public boolean check(String uname,String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login",username,password);
			PreparedStatement s = con.prepareStatement(sql);
			s.setString(1, uname);
			s.setString(2, pass);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				return true;
					
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
