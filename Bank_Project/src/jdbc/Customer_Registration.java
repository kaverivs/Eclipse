package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Customer_Registration {
	private int input;
	private static Scanner sc=new Scanner(System.in);

	public void register() throws Exception {
		int i;
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		Statement st=con.createStatement();
		Customer_Details obj=new Customer_Details() ;
		System.out.println("\n*****Welcome to e-bank*****\n");
		do {
			System.out.println("\n1.Register\n2.Display\n3.Exit");
			i=sc.nextInt();
			switch(i) {
				case 1:
					obj.insertTable(con,st);
					break;
				case 2:
					obj.retrieveTable(con, st);
					break;
				case 3:
					System.out.println("Do you want to exit ?");
					break;
				default:
					System.out.println("invalid entry...Please select the valid option");
					break;
			}
			if(i==3) {
				System.out.println("\n1.Yes\n2.No");
				input=sc.nextInt();
				if(input==1) {
					System.out.println("Exiting....");
				}
				else {
					input=2;
				}
			}
		}while(input==2||(i>0)&&(i<3));
		
	}
}