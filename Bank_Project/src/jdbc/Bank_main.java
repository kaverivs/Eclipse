package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Bank_main {

public static void main(String[] args) throws Exception {
		
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		Statement s=c.createStatement();
				
		Customer_Details obj=new Customer_Details() ;
		obj.createDb(c, s);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		Statement st=con.createStatement();
		
		obj.createTable(con, st);
		obj.alterTable(con, st);
		
		Customer_Registration reg=new Customer_Registration();
		reg.register();
	}
}


