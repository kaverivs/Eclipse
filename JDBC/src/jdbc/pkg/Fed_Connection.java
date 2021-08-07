package jdbc.pkg;

import java.sql.*;
public class Fed_Connection {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fed","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from customer_details");		
		while (rs.next()){
			System.out.println("Customer_details");
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3));
		}
		System.out.println();
		ResultSet rs1=st.executeQuery("select * from account_details");
		while(rs1.next()) {
			System.out.println("Account_details");
			System.out.println(rs1.getInt(1)+" "+ rs1.getInt(2)+" "+rs1.getString(3));
		}
		
		st.close();
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
