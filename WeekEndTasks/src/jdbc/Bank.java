package jdbc;

import java.sql.*;
public class Bank  {
	
	public static void main(String[] args) throws Exception {
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		Statement s=c.createStatement();
		
		Customer_Details obj=new Customer_Details() ;
		obj.createDb(c, s);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		Statement st=con.createStatement();
		
		obj.createTable(con, st);
		obj.alterTable(con, st);
		obj.insertTable(con, st);
		obj.insertTable(con, st);
		obj.insertTable(con, st);
		obj.retrieveTable(con, st);
	}

}
