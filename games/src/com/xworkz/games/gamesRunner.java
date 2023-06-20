package com.xworkz.games;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class gamesRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			System.out.println(connect.getSchema());
			
			String query = "insert into games values(1,'kho-kho',11,'Yes','No','Available','Two')";
			String query2 = "insert into games values(2,'Kabaddi',7,'Yes','No','Available','Two')";
			String query3 = "insert into games values(3,'Volley Ball',7,'Yes','No','Available','Two')";
			String query4 = "insert into games values(4,'Throw Ball',10,'Yes','No','Available','Two')";
			String query5 = "insert into games values(5,'Running',1,'No','Yes','Available','Solo')";
			String query6 = "insert into games values(6,'Rilley',4,'Yes','No','Available','more than Two')";
			String query7 = "insert into games values(7,'Foot Ball',11,'Yes','No','Available','Two')";
			String query8 = "insert into games values(8,'Cricket',11,'Yes','No','Available','Two')";
			String query9 = "insert into games values(9,'Jumping',1,'No','Yes','Available','Solo')";
			String query10 = "insert into games values(10,'Jowling Throw',1,'No','Yes','Available','Soloo')";
			
			Statement state = connect.createStatement();
			
			int i =  state.executeUpdate(query10);
			System.out.println("effected rows : "+i);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
