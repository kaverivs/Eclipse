package jdbc.pkg;

import java.sql.*;
import java.util.Scanner;

public class School_Connection   {

	static final String url="jdbc:mysql://localhost:3306/school";
	static final String uname="root";
	static final String upswd="root";
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {

		try(Connection c=DriverManager.getConnection(url,uname,upswd);Statement s=c.createStatement();){
			
			String create="create table student (id int auto_increment primary key, name varchar(50) not null)";
			s.executeUpdate(create);
			System.out.println("Student table created successfully");
			
			System.out.println("Enter the name to be inserted in table school ");
			String input=sc.next();
			String insert="insert into student (name) value('"+input+"')";
			s.executeUpdate(insert);
			System.out.println("Student table inserted successfully");	
			
			String select ="select * from student";
			ResultSet rs=s.executeQuery(select);
			while(rs.next()) {
				System.out.println("\nTable School");
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
			sc.close();
			s.close();
			c.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
