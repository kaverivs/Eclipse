package jdbc.pkg;
import java.sql.*;
public class MyProject_Connection {

	public static void main(String[] args) {
		try {
			String url ="jdbc:mysql://localhost:3306/myproject";
			String userName = "root";
			String pswd ="root";
			String query="select * from employeeterritories";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,pswd);
			Statement st=con.createStatement();
			
//RETRIEVING
			
			//1
			ResultSet rs= st.executeQuery("select p.ProductName ,p.UnitPrice "
					+ "from orderdetails o join products p "
					+ "on o.ProductID=p.ProductID group by ProductName;");
			
			System.out.println("\nDISPLAYING THE PRODUCTS WITH THEIR PRICE \n");
			while (rs.next()) {
				System.out.println(rs.getString(1)+" : "+rs.getInt(2));
			}
			
			//2
			ResultSet rs1= st.executeQuery("select * from productsupplier");
			
			System.out.println("\n\nDISPLAYING VIEW 'ProductSupplier'\n");
			while (rs1.next()) {
				System.out.println(rs1.getInt(1)+" - "+rs1.getString(2)+" - "+rs1.getInt(3)
				+" - "+rs1.getString(4)+" - "+rs1.getDouble(5)+" - "+rs1.getInt(6)+" - "+
						rs1.getString(7)); 
			}
			
//DROP TABLE
			
			String drop_query = "Drop table employeeterritories";
			st.executeUpdate(drop_query);
			System.out.println("\n\n**Table employeeterritories dropped**");
			
			
			
//CREATE TABLE
			
			String create_query = "Create table employeeterritories(\r\n"
					+ "					employeeID mediumint(8) not null,\r\n"
					+ "					foreign key (EmployeeID) references employees(EmployeeID) on delete cascade,\r\n"
					+ "					TerritoryID varchar(20)\r\n"
					+ "					)";
			st.executeUpdate(create_query);
			System.out.println("\n\n**Table employeeterritories created**");
			
			
			ResultSet rs2= st.executeQuery(query);
			
			System.out.println("\n\nTABLE : EMPLOYEETERRITORIES\n");
			while (rs2.next()) {
				System.out.println("employeeID : "+rs2.getInt(1)+"  TerritoryID : "+rs2.getString(2));
			}
			
//INSERTION
			
			//1
			String insert_query="insert into employeeterritories (EmployeeID,TerritoryID)\r\n"
					+ "			values(100,'72');";
			st.executeUpdate(insert_query);	
			
			//2
			insert_query="insert into employeeterritories (EmployeeID,TerritoryID)\r\n"
					+ "values(101,'72');";
			st.executeUpdate(insert_query);		
			
			//3
			insert_query="insert into employeeterritories (EmployeeID,TerritoryID)\r\n"
					+ "			values(102,'74');";
			st.executeUpdate(insert_query);	
			
			//4
			insert_query="insert into employeeterritories (EmployeeID,TerritoryID)\r\n"
					+ "			values(103,'71');";
			st.executeUpdate(insert_query);
			
			//5
			insert_query="insert into employeeterritories (EmployeeID,TerritoryID)\r\n"
					+ "			values(103,'75');";
			st.executeUpdate(insert_query);
			
			System.out.println("\n**Inserted in to database**");
			
			ResultSet rs4= st.executeQuery(query);
			
			System.out.println("\n\nTABLE : EMPLOYEETERRITORIES after insertion\n");
			System.out.println();
			while (rs4.next()) {
				System.out.println("employeeID : "+rs4.getInt(1)+"  TerritoryID : "+rs4.getString(2));
			}
			
			
			
//DELETION
			//1
			String delete_query = "Delete from employeeterritories where EmployeeID=101";
			st.executeUpdate(delete_query);
			delete_query = "Delete from employeeterritories where TerritoryID=74";
			st.executeUpdate(delete_query);
						
						
			ResultSet rs3= st.executeQuery(query);
			
			System.out.println("\n\nTABLE : EMPLOYEETERRITORIES after deletion\n");
			System.out.println();
			while (rs3.next()) {
				System.out.println("employeeID : "+rs3.getInt(1)+"  TerritoryID : "+rs3.getString(2));
			}
			
		
//UPDATION
			
			//1
			String update_query="update employeeterritories set TerritoryID=74 where EmployeeID=100 ";
			st.executeUpdate(update_query);	
			
			//2
			update_query="update employeeterritories set employeeID=101 where EmployeeID=103 and TerritoryID=71 ";
			st.executeUpdate(update_query);	
			
			System.out.println("\n\nUpdated the employee id to database");
			
			ResultSet rs5= st.executeQuery(query);
			
			System.out.println("\n\nTABLE : EMPLOYEETERRITORIES after updation\n");
			System.out.println();
			while (rs5.next()) {
				System.out.println("employeeID : "+rs5.getInt(1)+"  TerritoryID : "+rs5.getString(2));
			}
						
			st.close();
			con.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}

