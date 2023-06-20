package com.xworkz.avengers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class avengersRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mysql registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avengers","root","Xworkzodc@123");
			System.out.println(connect.getSchema());
			
			String query = "insert into avengers values(1,'Thor','Thunder Power','StromeBreaker','Powerfull Avenger',4,"
					+ "'live','Thor:Rune King','Saving')"; 
			
			String query1 = "insert into avengers values(2,'Iron Man','Nano Technology','Iron Suit','Third',3,"
					+ "'died','N/A','Saving')"; 
			
			String query2 = "insert into avengers values(3,'Captain America','Syrum','Vibranium Shield','Fourth',3,"
					+ "'died','N/A','Soldier')";
			
			String query3 = "insert into avengers values(4,'Hulk','Gamma Radiation','Anger','Second',2,"
					+ "'Live','N/A','Scientist')"; 
			
			String query4 = "insert into avengers values(5,'Dr.Strange','Magic','Magic','Fifth',2,"
					+ "'Live','N/A','Saving')"; 
			
			String query5 = "insert into avengers values(6,'Spider Man','Spider','Spider Suit','Eight',3,"
					+ "'Live','N/A','Saving Town')"; 
			
			String query6 = "insert into avengers values(7,'Black Widow','Martial Arts','Electric Parts','Sixth',1,"
					+ "'died','N/A','Agent')"; 
			
			String query7 = "insert into avengers values(8,'Clint','Hawkeye','Archer','Seventh',1,"
					+ "'Live','N/A','Agent')"; 
			
			String query8 = "insert into avengers values(9,'Black Panther','Vibranium','Black Panther Vibranium Suit','Ninth',1,"
					+ "'died','N/A','King of Wakanda')"; 
			
			String query9 = "insert into avengers values(10,'Falcon','Falcon Technology','Falcon Suit','Tenth',1,"
					+ "'Live','Falcon & Winter Soldier','Saving')"; 
			
			Statement state = connect.createStatement();
			
			int i = state.executeUpdate(query9);
			System.out.println("affected rows : "+i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
