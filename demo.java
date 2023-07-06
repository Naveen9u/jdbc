package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException    {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajay","root", "root");
		
		Statement st=con.createStatement();
		
		//st.executeUpdate("create table dept1(deptid int, deptname varchar(10))");
		
		st.executeUpdate("insert into dept1 values(101,'computers')");
		
		
		
		con.close();
		
		System.out.println("is one created");
	
	
	
	
	
	
	
	}
	
	

}
