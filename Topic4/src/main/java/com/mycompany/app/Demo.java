package com.mycompany.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		dbconn conn = new dbconn();
		
		
		PreparedStatement stmt = conn.conectar().prepareStatement("SELECT * FROM teacher where idteacher=?");
		PreparedStatement stmt2 = conn.conectar().prepareStatement("SELECT * FROM course where idteacher=?");
		
		stmt.setString(1,"3");
		stmt2.setString(1,"3");
		
		ResultSet rs = stmt.executeQuery();
		ResultSet rs2 = stmt2.executeQuery();
		
		while(rs.next()) {
			
			System.out.println("Teacher: "+rs.getString("lastname")+", "+rs.getString("firstname"));
			
			while(rs2.next()){
			
			System.out.println("Course Name: "+rs2.getString("name"));
			System.out.println("Days: "+rs2.getString("days"));
			System.out.println("Hour : "+rs2.getString("startTime")+" - "+rs2.getString("endTime"));
			System.out.println("");
		}
		}
		
		rs.close();
		rs2.close();
		stmt.close();
		stmt2.close();
		
	}

}
