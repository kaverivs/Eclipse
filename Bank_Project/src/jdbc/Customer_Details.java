package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Customer_Details {
	
	String sql;
	static Scanner sc= new Scanner(System.in);
		
	void createDb(Connection c, Statement s) throws Exception{
		sql="create database bank;";
		s.executeUpdate(sql);	
		System.out.println("Database Bank is created...");
	}
	
	void createTable(Connection con, Statement st) throws Exception{
		sql="create table Customer_details "
				+ "(cust_id int auto_increment primary key,cust_name varchar(50) not null,cust_age smallint not null)";
		st.executeUpdate(sql);	
		System.out.println("Table Customer_details is created...");
	}
	
	void alterTable(Connection con, Statement st) throws Exception{
		sql="alter table Customer_details auto_increment=100";
		st.executeUpdate(sql);	
		System.out.println("Table Customer_details altered...");
	}
	
	void insertTable(Connection con, Statement st) throws Exception{	
		System.out.println("Enter the customer name :");
		String name=sc.next();	
		sc.nextLine();
		System.out.println("Enter the customer age :");
		int age=sc.nextInt();
		if (age>=18) {
			sql=" Insert into Customer_details (cust_name,cust_age) value ('"+name+"',"+age+")";
			st.executeUpdate(sql);	
			System.out.println("Inserted...");
		}
		else {
			System.out.println("\nYou are under 18, you'll need either a co-signer or joint account holder over the age of 18.\n");
		}
		
	}
	
	void retrieveTable(Connection con, Statement st) throws Exception {
		sql="select * from Customer_details";
		ResultSet rs=st.executeQuery(sql);
		System.out.println("\nTable Customer_details\n");
		while(rs.next()) {			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	
}
