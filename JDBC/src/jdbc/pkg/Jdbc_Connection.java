package jdbc.pkg;

//STEP 1 : import package
import java.sql.*; 

public class Jdbc_Connection {
	public static void main (String args[]) {
		try {
			 /*STEP 2: 
			 * a.Load the driver --driver name: "com.mysql.cj.jdbc.Driver" 
			 * 			( loading this driver from mysql-connector jar file in the library)
			 * 
			 * b.Register the driver -- forName("com.mysql.cj.jdbc.Driver")
			 * 
			 * 		("forName(<driver name>)" belongs to a class called "Class". So we use 
			 * 				the syntax, Class.forName(driver name) to register the driver)
			 */
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/*STEP 3 : Establish the connection
			 * 
			 * Connection is an interface 
			 * 
			 * Since we can't instantiate interface directly by giving,
			 * 		Connection con= new Connection(); 
			 *  
			 * So we instantiate the interface Connection using the 
			 * implemented method getConnection()
			 * 
			 * getConnection() is a static method have 3 parameters- 
			 * 		db name //(url) , username and password
			 * 
			 * DriverManager is the class where getConnection method belongs to
			 */
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					+ "classicmodels","root","root");
			
			/*STEP 4 : Create statement
			 * 
			 * Mainly 3 types of statements - Statement,Prepared statement, Callable statement
			 */
			
			Statement st=con.createStatement();
			
			/*
			 * STEP 5 : Execute the query
			 * 
			 */
			
			ResultSet rs=st.executeQuery("select employeeNumber,firstName,lastName "
					+ "from employees where officeCode=1");
			
			/*
			 * STEP 6 : Process the result 
			 * 
			 * (which will be a table in structure)
			 */
			
			while(rs.next()) {
				System.out.println();
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3));
			}
			
			/*STEP 7 : Close the connection and statement
			 */
			st.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
