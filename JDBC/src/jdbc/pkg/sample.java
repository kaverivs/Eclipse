package jdbc.pkg;
	import java.sql.*;

public class sample {

		public static void main(String[] args) {
			try {
				String url ="jdbc:mysql://localhost:3306/myproject";
				String userName = "root";
				String pswd ="root";
				String query="select * from customerdemographics";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,userName,pswd);
				Statement st=con.createStatement();
				
	//RETRIEVING
				
				//1
				ResultSet rs= st.executeQuery("select p.ProductName ,p.UnitPrice "
						+ "from orderdetails o join products p "
						+ "on o.ProductID=p.ProductID group by ProductName;");
				
				System.out.println("\nDISPLAYING PRODUCTS WITH THEIR PRICE\n");
				while (rs.next()) {
					System.out.println(rs.getString(1)+" : "+rs.getInt(2));
				}
				
				//2
				ResultSet rs1= st.executeQuery("select * from productsupplier");
				
				System.out.println("\nDISPLAYING VIEW 'ProductSupplier'\n");
				while (rs1.next()) {
					System.out.println(rs1.getInt(1)+" - "+rs1.getString(2)+" - "+rs1.getInt(3)
					+" - "+rs1.getString(4)+" - "+rs1.getDouble(5)+" - "+rs1.getInt(6)+" - "+
							rs1.getString(7)); 
				}
				
				//3
				ResultSet rs2= st.executeQuery(query);
				
				System.out.println("\n\nTABLE : EMPLOYEETERRITORIES\n");
				while (rs2.next()) {
					System.out.println("CustomerType : "+rs2.getString(1)+"  CustomreDesc : "+rs2.getString(2));
				}
				
	//INSERTION
				
				String insert_query="insert into customerdemographics (CustomerTypeID,CustomerDesc)\r\n"
						+ "values('cType4','ONE TIME PURCHASE ')";
				st.executeUpdate(insert_query);			
				insert_query="insert into customerdemographics (CustomerTypeID,CustomerDesc)\r\n"
						+ "values('cType5','Spam account ')";
				st.executeUpdate(insert_query);		
				System.out.println("\nInserted in to database");
				
				ResultSet rs4= st.executeQuery(query);
				
				System.out.println("\n\nTABLE : EMPLOYEETERRITORIES after insertion\n");
				System.out.println();
				while (rs4.next()) {
					System.out.println("CustomerType : "+rs4.getString(1)+"  CustomreDesc : "+rs4.getString(2));
				}
				
				
				
	//DELETION
				
				String delete_query = "delete from customercustomerdemo where CustomerTypeID='cType3';";
				st.executeUpdate(delete_query);
				ResultSet rs3= st.executeQuery(query);
				
				System.out.println("\n\nTABLE : EMPLOYEETERRITORIES after deletion\n");
				System.out.println();
				while (rs3.next()) {
					System.out.println("CustomerType : "+rs3.getString(1)+"  CustomreDesc : "+rs3.getString(2));
				}
				
				
				
				
				//UPDATION
				
				
				
				st.close();
				con.close();
			}catch (Exception e) {
				System.out.println(e);
			}
		}

}
