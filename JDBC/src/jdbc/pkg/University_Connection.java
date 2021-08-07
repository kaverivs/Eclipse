package jdbc.pkg;
import java.sql.*;
public class University_Connection {

	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost:3306/University";
			String userName="root";
			String pswd = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,pswd);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from EngineeringStudents");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+
						rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)	);
			}
			st.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
